package com.lmy.springboot.modules.db.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lmy.springboot.modules.db.domain.User;
import com.lmy.springboot.modules.db.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.db.controller
 * @ClassName: TestController
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/19
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/test/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{userId}")
    public Object getUserInfo(@PathVariable(value = "userId", required = false) String userId) {

        User user = userService.getUserInfoById(userId);
        return user;
    }

    @RequestMapping("/list")
    public Object getUserInfoList() {
        Page page = PageHelper.startPage(0, 5);
        List<User> userList = userService.getUserInfoList();
        log.info("total: {}", page.getTotal());
        log.info("pageInfo: {}", page.toString());
        return userList;
    }



}
