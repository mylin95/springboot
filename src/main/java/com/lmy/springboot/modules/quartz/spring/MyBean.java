package com.lmy.springboot.modules.quartz.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.quartz
 * @ClassName: MyBean
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/11
 * @Version: 1.0
 */
@Component("myBean")
@Slf4j
public class MyBean {
    public void printMessage() {
        log.info("MyBean executes");
    }
}
