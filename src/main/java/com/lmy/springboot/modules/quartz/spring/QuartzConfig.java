package com.lmy.springboot.modules.quartz.spring;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.*;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.quartz
 * @ClassName: QuartzConfig
 * @Description: spring整合Quartz 的 配置类
 *                   打开注释的内容，即开启 任务调度
 * @Author: linmy
 * @Date: 2020/3/11
 * @Version: 1.0
 */
@Configuration
public class QuartzConfig {

    @Autowired
    MyBean myBean;
    @Autowired
    AnotherBean anotherBean;
    @Autowired
    @Qualifier("simpleJobDetail")
    MethodInvokingJobDetailFactoryBean simpleJobDetail;
    @Autowired
    @Qualifier("firstComplexJobDetail")
    JobDetailFactoryBean firstComplexJobDetail;

    // @Autowired
    // @Qualifier("mySimpleTrigger")
    // SimpleTriggerFactoryBean mySimpleTrigger;
    // @Autowired
    // @Qualifier("myCronTrigger")
    // CronTriggerFactoryBean myCronTrigger;
    // @Autowired
    // @Qualifier("schedulerFactory")
    // Scheduler myScheduler;



    /**
     * MethodInvokingJobDetailFactoryBean类 构建 JobDetail
     * @return
     */
    @Bean("simpleJobDetail")
    public MethodInvokingJobDetailFactoryBean simpleJobDetail() {
        MethodInvokingJobDetailFactoryBean factoryBean = new MethodInvokingJobDetailFactoryBean();
        factoryBean.setTargetObject(myBean);
        factoryBean.setTargetMethod("printMessage");
        return factoryBean;
    }

    /**
     * JobDetailFactoryBean类 构建 JobDetail
     * @return
     */
    @Bean
    public JobDetailFactoryBean firstComplexJobDetail() {
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("anotherBean", anotherBean);

        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(FirstScheduledJob.class);
        factoryBean.setJobDataMap(jobDataMap);
        factoryBean.setDurability(true);
        return factoryBean;
    }

    /********** 创建一个 SimpleTrigger **********/
    // @Bean
    // public SimpleTriggerFactoryBean mySimpleTrigger() {
    //     SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
    //     factoryBean.setJobDetail(this.simpleJobDetail.getObject());
    //     factoryBean.setStartDelay(1000L);
    //     factoryBean.setRepeatInterval(2000L);
    //      return factoryBean;
    // }
    //
    // /********** 创建一个 CronTrigger **********/
    // @Bean
    // public CronTriggerFactoryBean myCronTrigger() {
    //     CronTriggerFactoryBean factoryBean = new CronTriggerFactoryBean();
    //     factoryBean.setJobDetail(this.firstComplexJobDetail.getObject());
    //     factoryBean.setCronExpression("0/5 * * ? * *");
    //     return factoryBean;
    // }
    //
    // /********** 创建 SchedulerFactory **********/
    // @Bean
    // public SchedulerFactoryBean schedulerFactory() {
    //     SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
    //
    //     SimpleTrigger mySimpleTrigger = this.mySimpleTrigger.getObject();
    //     CronTrigger myCronTrigger = this.myCronTrigger.getObject();
    //
    //     schedulerFactoryBean.setTriggers(mySimpleTrigger, myCronTrigger);
    //     return schedulerFactoryBean;
    // }

}
