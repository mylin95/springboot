package com.lmy.springboot.modules.jpa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lmy.springboot.modules.jpa.domain.User;
import com.lmy.springboot.modules.jpa.domain.UserDemo;
import com.lmy.springboot.modules.jpa.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{userId}")
    public Object getUserInfo(@PathVariable(value = "userId", required = false) String userId) {

        User user = userService.getUserInfoById(userId);
        return user;
    }

    @GetMapping("/list")
    public Object getUserInfoList() {
        Page page = PageHelper.startPage(0, 5);
        List<User> userList = userService.getUserInfoList();
        log.info("total: {}", page.getTotal());
        log.info("pageInfo: {}", page.toString());
        return userList;
    }


    @PostMapping("/testLombokDataField")
    public Object testLombokDataField(@RequestBody UserDemo a) {
        // UserDemo a = new UserDemo(1, "2");
        log.info("userDemo.getABoy = {}", a.getABoy());
        return a.getABoy();
    }


}
