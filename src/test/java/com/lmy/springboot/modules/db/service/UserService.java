package com.lmy.springboot.modules.db.service;

import com.lmy.springboot.modules.db.domain.User;
import com.lmy.springboot.modules.db.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.db.service
 * @ClassName: TestService
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/19
 * @Version: 1.0
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public User getUserInfoById(String userId) {

        return userMapper.getUserInfoById(userId);
    }

    public List<User> getUserInfoList() {
        return userMapper.getUserInfoList();
    }
}
