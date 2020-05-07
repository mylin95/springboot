package com.lmy.springboot.modules.langplugin.controller;

import com.github.dozermapper.core.Mapper;
import com.lmy.springboot.config.Result;
import com.lmy.springboot.modules.langplugin.bean.Staff;
import com.lmy.springboot.modules.langplugin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.langplugin.controller
 * @ClassName: DozerTestController
 * @Description:
 * @Author: linmy
 * @Date: 2020/5/7
 * @Version: 1.0
 */
@Slf4j
@RequestMapping("/test")
@RestController
public class DozerTestController {
    
    @Autowired
    Mapper dozerMapper;
    
    @GetMapping("/dozer")
    public Result testDozerMapper() {
        User user = new User("lmy", 20, new Date());
        Staff staff = dozerMapper.map(user, Staff.class);
        log.info(staff.toString());
        return Result.success(staff);
    }
    
    
}
