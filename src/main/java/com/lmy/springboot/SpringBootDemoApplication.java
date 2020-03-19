package com.lmy.springboot;

// import com.lmy.springboot.base.mybatis.MyBatisRespority;

import com.lmy.springboot.modules.db.mapper.MyBatisRespority;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;


// 禁用springsecurity
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, MybatisAutoConfiguration.class})
@MapperScan(basePackages = "com.lmy.springboot", annotationClass = MyBatisRespority.class)
@EnableSwagger2
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
