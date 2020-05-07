package com.lmy.springboot.config;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Mapper dozerMapper() { // java的封装bean工具
        return DozerBeanMapperBuilder.buildDefault();
    }

}