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
    /**
     * 学号
     */
    private String id ;
    private List<String> hobbies ;

    public Student() {}

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
