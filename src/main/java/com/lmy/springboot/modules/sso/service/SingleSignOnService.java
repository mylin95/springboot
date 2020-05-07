package com.lmy.springboot.modules.sso.service;

import com.alibaba.fastjson.JSONObject;
import com.lmy.springboot.config.HttpStatusEnum;
import com.lmy.springboot.config.Result;
import com.lmy.springboot.modules.sso.domain.TbUser;
import com.lmy.springboot.modules.sso.mapper.TbUserMapper;
import com.lmy.springboot.modules.sso.support.RedisUtil;
import com.lmy.springboot.modules.sso.support.Token;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.sso.service
 * @ClassName: SingleLoginService
 * @Description:
 * @Author: linmy
 * @Date: 2020/4/27
 * @Version: 1.0
 */
@Slf4j
@Service
public class SingleSignOnService {

    @Autowired
    TbUserMapper tbUserMapper;


    @Value("1001")
    Integer aduid;


    @Autowired
    RedisUtil ru;
    @Autowired
    Token tk;

    public Result loginCheck(String username, String password, String reUrl, HttpServletResponse response) throws Exception {

        TbUser tbUser = tbUserMapper.getUserInfoByUsername(username);
        if (tbUser != null) {
            if (tbUser.getPassword().equals(password)) {
                // String token = UUID.randomUUID().toString();
                String token=tk.getToken(String.valueOf(tbUser.getUid()));
                tbUser.setPassword("");
                JSONObject json = new JSONObject();
                json.put(token, tbUser);
                ru.set(token, json, 600L); // 10分钟

                response.sendRedirect(reUrl + "?token=" + token);
            }else {
                response.sendRedirect("login.html?reurl=" + reUrl);
                return Result.fail(HttpStatusEnum.BAD_REQUEST, "密码不正确，请重新输入！");
            }
        } else {
            response.sendRedirect("login.html?reurl=" + reUrl);
            return Result.fail(HttpStatusEnum.BAD_REQUEST, "用户名不存在！");
        }

        return Result.success();
    }

    public Result checkToken(String reurl, String token, HttpServletResponse response) throws Exception {
        String uuid=tk.getIdByToken(token);
        System.out.println(uuid);
        if(ru.exists(uuid)){
            TbUser tbUser=(TbUser) ru.get(uuid);
            String username = tbUser.getUsername();
            response.setHeader("username",username);
            log.info("username={}", username);
            return Result.success(tbUser);
        }
        response.setHeader("username", null);
        return Result.fail(HttpStatusEnum.UNAUTHORIZED);
        // return ResponseEntity.status(HttpStatus.UNAUTHORIZED);
    }
}
