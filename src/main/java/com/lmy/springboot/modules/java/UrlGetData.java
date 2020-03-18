package com.lmy.springboot.modules.java;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ProjectName: java
 * @Package: PACKAGE_NAME
 * @ClassName: UrlGetData
 * @Description: 模拟本系统通过Url方式发送报文到目标服务器，并获取返回数据：（实现类）
 * @Author: linmy
 * @Date: 2020/3/5
 * @Version: 1.0
 */

public class UrlGetData {

    public static void callBlaze(String url ,String data) throws Exception{
        URL u = new URL(url);
        System.out.println("建立链接....");
        //获取连接对象
        URLConnection uc = u.openConnection();
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
        //获取到返回数据的输入流
        InputStream is = uc.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String line = "";
        StringBuffer blzRspXml = new StringBuffer();
        System.out.println("获取返回数据:");
        while((line = br.readLine()) != null){
            //读取返回数据，分行读取
            System.out.println(line.trim());
            blzRspXml.append(line.trim());
        }
    }

    public static void main(String args[]){

        //目标服务器地址
        // String url1 = "http://10.14.30.242:9080/RES/Rule";
        String url = "http://47.100.108.80:9200";
        //发送的报文
        String data1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><CardRequest><SEQ_TIME_STAMP>2014325170152799504</SEQ_TIME_STAMP><TYPE>1</TYPE><v_101>-999998</v_101><v_102>0.002740</v_102><v_109>111.11</v_109></CardRequest>";
        try {
            UrlGetData.callBlaze(url,data1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}