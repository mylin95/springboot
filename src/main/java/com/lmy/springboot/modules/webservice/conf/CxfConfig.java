package com.lmy.springboot.modules.webservice.conf;

import com.lmy.springboot.modules.webservice.cxfdemo.WebServiceTestDemo;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @Package: com.lmy.springboot.modules.webservice.conf
 * @Description:
 *  CXF的方式使用 WebService服务
 * @Author: linmy
 * @Date: 2020/9/16
 */
@Configuration
public class CxfConfig {

    @Bean(name = "cxfServlet")
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(),"/lmy/service/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public WebServiceTestDemo webServiceTestDemo() {
        return new WebServiceTestDemo();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), webServiceTestDemo());
        endpoint.publish("/api");
        return endpoint;
    }

}