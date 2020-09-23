package com.lmy.springboot.modules.jpa.controller;

import com.lmy.springboot.modules.jpa.domain.UserEntity;
import com.lmy.springboot.modules.jpa.repository.UserEntityRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/jpa/user")
public class UserJpaController {

    @Autowired
    UserEntityRepo userEntityRepo;

    @GetMapping("/{userId}")
    public Object getUserInfo(@PathVariable(value = "userId", required = false) Long userId) {

        UserEntity user = userEntityRepo.findById(userId).get();
        return user;
    }

    // @RequestMapping("/list")
    // public Object getUserInfoList() {
    //     Page page = PageHelper.startPage(0, 5);
    //     List<User> userList = userService.getUserInfoList();
    //     log.info("total: {}", page.getTotal());
    //     log.info("pageInfo: {}", page.toString());
    //     return userList;
    // }

    @GetMapping("/list")
    public Object getUserInfoList() {
        List<UserEntity> all = userEntityRepo.findAll();
        return all;
    }

}
