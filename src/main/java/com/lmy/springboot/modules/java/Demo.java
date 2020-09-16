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

        // 非空
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

        strings.set(1, "一");
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
    public void test() {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, String>> mapList = new ArrayList<>();
        Map<String, String> itemMap = new HashMap<>();
        // mapList.add(itemMap);
        // map.put("gradingSystem", mapList);
        // MapUtils.getMap(map, "gradingSystem");
        List<Map<String, String>> list = (List<Map<String, String>>) map.get("gradingSystem");
        if (list != null && list.size() > 0) {
            String instName = list.get(0).get("instName");
            System.out.println(instName);
        }

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
    /**
     * 包装类比较相等
     */
    @Test
    public void testFun1() {
        Integer a = 235;
        Integer b = 235;
        if (a.equals(b)) {
            System.out.println("a = b");
        }
    }

    /**
     * (1)指定一个误差范围，两个浮点数的差值在此范围之内，则认为是相等的。
     */
    @Test
    public void testFun2() {
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        float diff = 1e-6f;
        if (Math.abs(a - b) < diff) {
            System.out.println("true");
        }
    }

    /**
     * (2)使用BigDecimal来定义值，再进行浮点数的运算操作。
     */
    @Test
    public void testFun3() {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);
        if (x.equals(y)) {
            System.out.println("true");
        }
    }

    /**
     * test
     */
    @Test
    public void testFun4() {
        BigDecimal recommend1 = new BigDecimal("0.1");
        BigDecimal recommend2 = BigDecimal.valueOf(0.1);
        System.out.println("recommend1 = " + recommend1);
        System.out.println("recommend2 = " + recommend2);
        if (recommend1.equals(recommend2)) {
            System.out.println("recommend1 = recommend2");
        }
    }

    @Test
    public void testFun5() {
        // String str = null;
        String str = (String) null;
        System.out.println(str instanceof String);

        Long num1 = 0L;
        long num2 = 1L;
        num1 = num2;
        System.out.println(num1 instanceof Long);
    }


    @Test
    public void testFun6() {
        String str = "a,b,c,,";
        String[] ary = str.split(",");
        // ary = {"a", "b", "c"} 预期大于3，结果是3
        System.out.println(ary.length);
    }

    @Test
    public void testFun7() {
        String str = "start";
        for (int i = 0; i < 100; i++) {
            str = str + "hello";
        }
        System.out.println(str);


        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str2.append("hello");
        }
        String s = str2.toString();
        System.out.println(s);
    }


    @Test
    public void testFun8() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.entrySet().forEach(e -> {
            System.out.println(e);
        });
    }

    @Test
    public void testFun9() {
        // TODO 2020-5-18 10:15:37 测试可选类（TODO的作用，备注编码内容，方便下次查找）
        Optional<Student> optional = Optional.of(new Student());
        Optional<Student> stu = Optional.empty();
        System.out.println(stu);
    }

    @Test
    public void testFun10() {
        Integer num = null;
        boolean isFlagsNull = num == null;
        long flags = isFlagsNull ? 0L : Long.parseLong(String.valueOf(num));
        System.out.println(flags);


    }

    @Test
    public void testFun11() {
        System.out.println(StringEscapeUtils.escapeXml10("<script>&alert('111')</script>"));
    }




}
