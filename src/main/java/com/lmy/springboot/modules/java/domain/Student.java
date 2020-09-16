package com.lmy.springboot.modules.java.domain;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: java
 * @Package: domain
 * @ClassName: Student
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/9
 * @Version: 1.0
 */
@Data
public class Student {

    private String name ;
    private int age ;
    private String id ;  // Ñ§ºÅ
    private List<String> hobbies ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

}
