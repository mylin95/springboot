package com.lmy.springboot.modules.java;


import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.java
 * @ClassName: HotKeyIdea
 * @Description: IDEA快捷键
 * @Author: linmy
 * @Date: 2020/3/18
 * @Version: 1.0
 */

public class HotKeyIdea {

    /**
     * live template 中设置 pvt 快捷生成test方法
     */
    @Test
    public void test() {
        // 再比如，要输入Date birthday = user.getBirthday()
        // 只需输入user.getBirthday().var+Tab即可。
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dtf.format(now);
        System.out.println(format);

    }

}
