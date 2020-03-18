package com.lmy.springboot.modules.java;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: java
 * @Package: PACKAGE_NAME
 * @ClassName: ArrayAndListDemo
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/4
 * @Version: 1.0
 */
public class ArrayAndListDemo {

    public static void main(String[] args) {
        // String[] strings = {"1", "2", "3"};
        List<String> strlist = new ArrayList<>();
        strlist.add("1");
        strlist.add("2");
        strlist.add("3");
        String[] strings = new String[strlist.size()];
        strlist.toArray(strings);
        System.out.println(strings.toString());

    }

    @Test
    public void listTest() {
        List<String> strlist = new ArrayList<>();
        strlist.add("1");
        strlist.add("2");
        strlist.add("3");
        System.out.println(strlist.toString());
        strlist.clear();
        System.out.println(strlist.toString());
        String a = "";

        if (a != "") {
            System.out.println("hello");
        }
    }

}
