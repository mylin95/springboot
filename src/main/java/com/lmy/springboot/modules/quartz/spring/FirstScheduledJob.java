package com.lmy.springboot.modules.quartz.spring;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.quartz
 * @ClassName: FirstScheduledJob
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/11
 * @Version: 1.0
 */
@Slf4j
public class FirstScheduledJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("FirstScheduledJob Executes ……");
    }
}
