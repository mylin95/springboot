package com.lmy.springboot.modules.webservice.cxfdemo;

import com.lmy.springboot.modules.webservice.domain.ErrorResult;
import com.lmy.springboot.modules.webservice.utils.XmlParseUtil;
import lombok.extern.slf4j.Slf4j;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @Package: com.lmy.springboot.modules.webservice.cxfdemo
 * @Description:
 *  webservice接口
 *      1.客户端接口、服务端接口（服务端调用客户端）
 *      2.通过 http://localhost:8888/lmy/service/api?wsdl
 *      3.通过 命名空间、方法名
 * @Author: linmy
 * @Date: 2020/9/16
 */
@Slf4j
@WebService(targetNamespace = "http://www.webservice.lmy.com/")
public class WebServiceTestDemo {

    /**
     * 客户端接口
     * @param inputInfo
     * @return
     * @throws InterruptedException
     */
    @WebMethod
    public String waitCallWebServiceMethod(@WebParam(name = "inputInfo") String inputInfo) throws InterruptedException {
        log.info("waitCallWebServiceMethod-inputInfo: {}", inputInfo);
        inputInfo = inputInfo.substring(inputInfo.indexOf("<Body>"), inputInfo.indexOf("</Body>") + 7);
        ErrorResult errorResult = XmlParseUtil.simpleXmltoBean(inputInfo, ErrorResult.class);
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
        sb.append("<ResRoot>\n");
        sb.append("    <Info Verson=\"V1\">\n");
        sb.append("        <Head>\n");
        sb.append("            <ResultCode>" + errorResult.getResultCode() + "</ResultCode>\n");
        sb.append("            <ErrMsg><![CDATA[" + errorResult.getErrMsg() + "]]></ErrMsg>\n");
        sb.append("            <WrapperException><![CDATA[" + errorResult.getWrapperException() + "]]></WrapperException>\n");
        sb.append("        </Head>\n");
        sb.append("        <Body></Body>\n");
        sb.append("    </Info>\n");
        sb.append("</ResRoot>\n");
        // Thread.sleep(10001);
        return sb.toString();
    }

}
