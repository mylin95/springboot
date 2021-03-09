package com.lmy.springboot.modules.jpa.domain;

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
public class UserDemo {

    private int userId;
    /** 这种命名方式，通过@RequestBody映射后的结果是
     * 前端传参：aboy才能被后端接收到
     * 建议标识符首字母单词不要是一个字母，至少是aaBc*/
    private String aBoy;

}
