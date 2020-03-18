package com.lmy.springboot.modules.java;

import com.lmy.springboot.modules.java.domain.Student;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: java
 * @Package: PACKAGE_NAME
 * @ClassName: MapTest
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/9
 * @Version: 1.0
 */

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "1");
        map1.put("2", "2");
        map1.put("3", "3");

        changeMap(map1);
        System.out.println(map1.toString());

        changeMap2(map1);
        System.out.println(map1.toString());



    }

    public static void changeMap(Map<String, String> map) {
        map.put("4", "4");
    }

    public static String changeMap2(Map<String, String> map) {
        map.put("4", "5");
        return "success";
    }
    
    @Test
    public void test() {
        Student stu = new Student("linmy", 18, "007");
        Map<String, Student> stuMap = new HashMap<>();
        stuMap.put("007", stu);

        // Student student = stuMap.get("007");
        // List<String> hobbies = student.getHobbies();
        // hobbies.add("tennis");
        // student.setHobbies(hobbies);
        // stuMap.put("007", student);

        Student stu2 = new Student("linmy2", 18, "008");
        ChangeStudent(stu2);
        System.out.println("stu2: " + stu2.toString());

        ChangeStudent2(stuMap);
        System.out.println(stuMap.get("007").toString());


        Student student = stuMap.get("12334");
        System.out.println(student);


        Map<String, Object> map = new HashMap<>();
        Student stu3 = new Student("linmy2", 18, "008");
        stu3.setAge((Integer) map.get("aaa"));

    }

    public void ChangeStudent(Student student) {
        student.setAge(20);
    }
    public void ChangeStudent2(Map<String, Student> stuMap) {
        stuMap.get("007").setAge(20);
    }

}
