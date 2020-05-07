package com.lmy.springboot.modules.sso.controller;

import com.lmy.springboot.config.Result;
import com.lmy.springboot.modules.sso.domain.TbUser;
import com.lmy.springboot.modules.sso.service.SingleSignOnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.sso.controller
 * @ClassName: singleLoginController
 * @Description:
 * @Author: linmy
 * @Date: 2020/4/27
 * @Version: 1.0
 */
@RestController
@RequestMapping("")
public class SingleSignOnController {

    @Autowired
    SingleSignOnService singleSignOnService;

    @PostMapping(value = "/user/loginCheck", produces = { "application/json;charset=UTF-8" })
    public Result loginCheck(@ModelAttribute  TbUser tbUser, @RequestParam String reUrl, HttpServletResponse response) throws Exception {
        Result result = singleSignOnService.loginCheck(tbUser.getUsername(), tbUser.getPassword(), reUrl, response );
        return result;
    }

    @RequestMapping("/user/checkToken")
    public Result checkToken(@RequestParam String reurl, @RequestParam String token, HttpServletResponse response) throws Exception {
        Result result = singleSignOnService.checkToken(reurl, token, response);
        return result;
    }

}
