package com.lmy.springboot.modules.db.domain;

import lombok.Data;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.db.domain
 * @ClassName: User
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/19
 * @Version: 1.0
 */
@Data
public class User {

    private int userId; //user_id
    private String username;
    private int age;
    private String password;


}
