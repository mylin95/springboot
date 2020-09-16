package com.lmy.springboot.modules.webservice.controller;

import com.lmy.springboot.modules.webservice.utils.HttpClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketTimeoutException;

/**
 * @Package: com.lmy.springboot.modules.webservice.controller
 * @Description:
 * @Author: linmy
 * @Date: 2020/9/16
 */
@Slf4j
@Api(tags = "Restful中调用WebService接口")
@RestController("/restful")
public class WebServiceTestController {

    @ApiOperation(value = "动态调用", notes = "只需要 wsdlUrl + 方法名 + 方法参数")
    @GetMapping("/callWebService1")
    public String restfulCallWeb1() {
        //创建动态客户端
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://localhost:8888/lmy/service/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        //client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD));
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        //连接超时
        httpClientPolicy.setConnectionTimeout(2000);
        //取消块编码
        httpClientPolicy.setAllowChunking(false);
        //响应超时
        httpClientPolicy.setReceiveTimeout(120000);
        conduit.setClient(httpClientPolicy);
        //设置拦截器
        //client.getOutInterceptors().addAll(interceptors);
        try {
            Object[] objects = new Object[0];
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("waitCallWebServiceMethod", "sujin");
            log.info(objects.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @ApiOperation(value = "同SoapUI拼接字符串的方式", notes = "需要 wsdlUrl + 命名空间 + 方法名 + 方法参数")
    @GetMapping("/callWebService2")
    public String restfulCallWeb2() throws SocketTimeoutException {
        StringBuilder sb = new StringBuilder();

        String serviceUrl = "http://localhost:8888/lmy/service/api";
        String webServiceNameSpace = "http://www.webservice.lmy.com/";
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\""
                + webServiceNameSpace
                + "\">\n    <soapenv:Header/>\n    <soapenv:Body>\n        <web:waitCallWebServiceMethod>\n            <!--Optional:-->\n            <inputInfo><![CDATA[\n");
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<ReqRoot>\n");
        sb.append("    <Info Verson=\"V1\">\n");
        sb.append("        <Head>\n");
        sb.append("            <CompanyCode>1</CompanyCode>\n");
        sb.append("        </Head>\n");
        sb.append("        <Body>\n");
        sb.append("            <ResultCode>0</ResultCode>\n");
        sb.append("            <ErrMsg>aaaa</ErrMsg>\n");
        sb.append("            <WrapperException>bbbb</WrapperException>\n");
        sb.append("        </Body>\n");
        sb.append("    </Info>\n");
        sb.append("</ReqRoot>]]>\n");
        sb.append("            </inputInfo>\n"
                + "        </web:waitCallWebServiceMethod>\n    </soapenv:Body>\n</soapenv:Envelope>");
        String invoke = null;
        invoke = HttpClient.invoke(serviceUrl, sb.toString());
        invoke = StringEscapeUtils.unescapeXml(invoke);
        invoke = invoke.substring(invoke.indexOf("<return>") + 8, invoke.indexOf("</return>"));
        return invoke;
    }
}
