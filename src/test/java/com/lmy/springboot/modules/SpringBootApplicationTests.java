package com.lmy.springboot.modules;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
class SpringBootApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;
    
    @Test
    void contextLoads() {
        log.info("hello java ");
        log.info("你好 java ");
        // testFn1();
    }

    /**
     * 测试mvc的接口，能否获取数据
     */
    @Test
    void testFn1() {

        ResponseEntity<JSONObject> forEntity = restTemplate.getForEntity("/test/user/1",
                JSONObject.class);
        log.info(forEntity.toString());
        log.info(forEntity.getBody().toString());
    }

    @Test
    void testFn2() {

        ResponseEntity<JSONObject> forEntity = restTemplate.getForEntity("/test/user/list",
                JSONObject.class);
        log.info(forEntity.toString());
        log.info(forEntity.getBody().toString());
    }

}
