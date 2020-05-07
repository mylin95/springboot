package com.lmy.springboot.modules.langplugin;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.lmy.springboot.modules.langplugin.bean.Staff;
import com.lmy.springboot.modules.langplugin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.langplugin
 * @ClassName: BeanUtilsTest
 * @Description:
 * @Author: linmy
 * @Date: 2020/5/7
 * @Version: 1.0
 */
@Slf4j
public class BeanUtilsTest {
    
    
    @Test
    public void test () {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        User user = new User("lmy", 20, new Date());
        Staff staff = mapper.map(user, Staff.class);
        log.info(staff.toString());

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", "tom");
        paramMap.put("age", 21);
        paramMap.put("birthday", new Date());
        paramMap.put("birthday2", new Date());

        Staff staff2 = mapper.map(paramMap, Staff.class);
        log.info(staff2.toString());
        
    }
}
