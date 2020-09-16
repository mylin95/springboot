package com.lmy.springboot.modules.webservice.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/**
 * @author linmy
 * @Date 2020-9-14 10:50:30
 */
public class HttpClient {
    public static String invoke(String url, String content) throws SocketTimeoutException {
        String retStr = "";
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
        HttpPost httpPost = new HttpPost(url);
        // 设置超时时间 1分钟
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectionRequestTimeout(60000)
                .build();
        httpPost.setConfig(requestConfig);
        httpPost.setHeader("Content-Type", "text/xml;chartset=UTF-8");
        httpPost.setHeader("SOAPAction", "");
        StringEntity data = new StringEntity(content, Charset.forName("UTF-8"));
        httpPost.setEntity(data);
        try {
            CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            if (httpEntity != null) {
                retStr = EntityUtils.toString(httpEntity, "UTF-8");
            }
            closeableHttpClient.close();
        } catch (SocketTimeoutException e) {
            throw new SocketTimeoutException("响应超时——" + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retStr;
    }
}
