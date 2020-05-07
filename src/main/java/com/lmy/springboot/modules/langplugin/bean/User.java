package com.lmy.springboot.modules.langplugin.bean;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.langplugin.bean
 * @ClassName: User
 * @Description:
 * @Author: linmy
 * @Date: 2020/5/7
 * @Version: 1.0
 */
@Data
public class User {
    private String name ;
    private Integer age ;
    private Date birthday ;
    
    public User(){}
    
    public User(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    
}
