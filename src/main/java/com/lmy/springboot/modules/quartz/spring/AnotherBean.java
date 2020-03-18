package com.lmy.springboot.modules.quartz.spring;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.quartz
 * @ClassName: AnotherBean
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/11
 * @Version: 1.0
 */
@Component("anotherBean")
@Slf4j
@Data
public class AnotherBean {

    private String name ;

    public void printMessage() {
        log.info("AnotherBean executes");
    }
}
