package com.lmy.springboot.modules.sso.domain;

import lombok.Data;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.sso.domain
 * @ClassName: TbUser
 * @Description:
 * @Author: linmy
 * @Date: 2020/4/27
 * @Version: 1.0
 */
@Data
public class TbUser {

    private int uid; //user_id
    private String username;
    private int age;
    private String password;

}
