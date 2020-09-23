package com.lmy.springboot.modules.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Package: com.lmy
 * @Description: java8新特性测试
 * @Author: linmy
 * @Date: 2020/7/6
 */
public class Java8Test {

    public static void main(String[] args) {

        createStream();

        // Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);

    }

    /**
     * java8稽核接口生成流的两个方法：
     *  stream() − 为集合创建 串行流。
     *  parallelStream() − 为集合创建 并行流。
     */
    private static void createStream() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("filtered: " + filtered);

    }


}
