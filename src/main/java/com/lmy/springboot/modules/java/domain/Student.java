package com.lmy.springboot.modules.java.domain;

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
public class Student {

    private String name ;
    private int age ;
    private String id ;
    /**
     * 学号
     */
    private List<String> hobbies ;

    public Student () {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
