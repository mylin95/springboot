package com.lmy.springboot.modules.java;

import com.alibaba.fastjson.JSONObject;
import com.lmy.springboot.modules.java.domain.Student;
import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        String str = "a\nb";
        str.replaceAll("\\\\", "-");
        System.out.println(str);

        // �ǿ�
        Map a = new HashMap();
        if(a == null) {
            System.out.println("aaa"+a.isEmpty());
        }

        String[] strArr = {"1", "2", "3"};
        System.out.println(strArr.length);
        System.out.println(strArr.toString());
        System.out.println(strArr);
        List<String> strings = Arrays.asList(strArr);
        System.out.println(strings);

        strings.set(1, "һ");
        System.out.println(strings);

        Date date = new Date();
        isWeekend(date);


        String hello = "hello world";
        System.out.println(hello.substring(5));
        System.out.println(hello.substring(0,5));

        String nullString = "";
        String[] split = nullString.split(",");
        System.out.println(1 + split[0] + 1);


        hello = "1,0,1";
        split = hello.split(",");
        System.out.println(split.toString());
        System.out.println(Boolean.parseBoolean("false"));
        System.out.println("0".equals("1"));


        // hello = "a,b,c,d,e";
        // String[] split1 = hello.split(",");
        // List<String> abcList = Arrays.asList(split1);
        // System.out.println(abcList);
        // Iterator<String> iterator = abcList.iterator();
        // while (iterator.hasNext()) {
        //     String next = iterator.next();
        //     iterator.remove();
        // }

        // abcList.remove(head);
        // System.out.println(head);
        // System.out.println(abcList);
        // abcList.add(head);
        // System.out.println(abcList);

        hello = "a,b,c,d,e";
        String[] split1 = hello.split(",");
        List<String> strings2 = Arrays.asList(split1);
        // strings2.add("a");
        // strings2.add("b");
        // strings2.add("c");
        // strings2.add("d");
        for (String s : strings2) {
            System.out.println("strings2+++++++++" +s);
        }
        // for (int i = 0; i < strings2.size(); i++) {
        //     System.out.println(strings2.get(i));
        // }

        Iterator<String> iterator2 = strings2.iterator();
        iterator2.hasNext();
        // while (iterator2.hasNext()){
        String next = iterator2.next();
        iterator2.remove();
            // System.out.println(next);
        // }
        strings2.add("a");
        System.out.println(strings2);


    }

    // public static boolean isWeekend(Date date) {
    //     boolean isWeekend = false;
    //     Calendar cale = Calendar.getInstance();
    //     cale.setTime(date);
    //     if (cale.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || cale.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
    //         isWeekend = true;
    //     }
    //     return isWeekend;
    // }

    public static boolean isWeekend(Date date) {
        boolean isWeekend = false;
        Calendar cale = Calendar.getInstance();
        cale.setTime(date);
        System.out.println(cale.get(Calendar.DAY_OF_WEEK));
        System.out.println(Calendar.SUNDAY );
        if (cale.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || cale.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            isWeekend = true;
        }
        return isWeekend;
    }


    @Test
    public void testFn12() {
        Student u = new Student();
        u.setName(null);
        u.setId(null);
        u.setHobbies(null);
        String str = JSONObject.toJSONString(u);
        JSONObject json = JSONObject.parseObject(str);
        System.out.println(json);
        Map<String, Student> map = new HashMap<>();
        map.put("1", u);
        u.setName("tom");
        System.out.println(map.toString());
    }

    @Test
    public void testFn13() throws InterruptedException {
        String param = null;
        System.out.println("null".hashCode());
        // switch (param) {
        //     case "null":
        //         System.out.println("null");
        //         break;
        //     default:
        //         System.out.println("default");
        // }

    }

}
