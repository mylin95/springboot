package com.lmy.springboot.modules.java;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ProjectName: java
 * @Package: PACKAGE_NAME
 * @ClassName: UrlGetData
 * @Description: 模拟本系统通过Url方式发送报文到目标服务器，并获取返回数据：（实现类）
 * @Author: linmy
 * @Date: 2020/3/5
 * @Version: 1.0
 */

public class UrlGetData2 {

    /**

     * 根据url获取json数据
     *?
     * @param url
     * @return
     */
    // public static String loadJson(String url) {
    //     StringBuilder json = new StringBuilder();
    //     try {
    //         URL urlObject = new URL(url);
    //         HttpURLConnection uc = (HttpURLConnection) urlObject
    //                 .openConnection();
    //         int contentLength = uc.getContentLength();
    //         System.out.println(contentLength);
    //         BufferedReader in = new BufferedReader(new InputStreamReader(uc
    //                 .getInputStream(), "utf-8"));
    //         String inputLine = null;
    //         while ((inputLine = in.readLine()) != null) {
    //             json.append(inputLine);
    //         }
    //         in.close();
    //         uc.disconnect();
    //     } catch (MalformedURLException e) {
    //         e.printStackTrace();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    //     return json.toString();
    // }

    /**

     * 根据url获取json数据
     *?
     * @param url
     * @return
     */
    public static String loadJson2(String url, String data) {
        StringBuilder json = new StringBuilder();
        try {
            URL urlObject = new URL(url);
            HttpURLConnection uc = (HttpURLConnection) urlObject
                    .openConnection();
            uc.setDoOutput(true);

            //获取输出流对象
            OutputStream raw = uc.getOutputStream();
            OutputStream buffered = new BufferedOutputStream(raw);
            OutputStreamWriter out = new OutputStreamWriter(buffered, "UTF-8");

            System.out.println("发送报文:"+data);
            out.write(data);

            out.flush();
            System.out.println("关闭连接");
            out.close();

            int contentLength = uc.getContentLength();
            System.out.println(contentLength);

            BufferedReader in = new BufferedReader(new InputStreamReader(uc
                    .getInputStream(), "utf-8"));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
            uc.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public static void main(String args[]){

        //目标服务器地址
        // String url1 = "http://10.14.30.242:9080/RES/Rule";
        String url = "http://47.100.108.80:9200";
        //发送的报文
        String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><CardRequest><SEQ_TIME_STAMP>2014325170152799504</SEQ_TIME_STAMP><TYPE>1</TYPE><v_101>-999998</v_101><v_102>0.002740</v_102><v_109>111.11</v_109></CardRequest>";
        try {
            String jsonString2 = UrlGetData2.loadJson2(url, data);
            System.out.println(jsonString2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}