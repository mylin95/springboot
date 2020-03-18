package com.lmy.springboot.modules.java;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ProjectName: java
 * @Package: PACKAGE_NAME
 * @ClassName: UrlGetData
 * @Description: ģ�Ȿϵͳͨ��Url��ʽ���ͱ��ĵ�Ŀ�������������ȡ�������ݣ���ʵ���ࣩ
 * @Author: linmy
 * @Date: 2020/3/5
 * @Version: 1.0
 */

public class UrlGetData {

    public static void callBlaze(String url ,String data) throws Exception{
        URL u = new URL(url);
        System.out.println("��������....");
        //��ȡ���Ӷ���
        URLConnection uc = u.openConnection();
        uc.setDoOutput(true);
        //��ȡ���������
        OutputStream raw = uc.getOutputStream();
        OutputStream buffered = new BufferedOutputStream(raw);
        OutputStreamWriter out = new OutputStreamWriter(buffered, "UTF-8");

        System.out.println("���ͱ���:"+data);
        out.write(data);

        out.flush();
        System.out.println("�ر�����");
        out.close();
        //��ȡ���������ݵ�������
        InputStream is = uc.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        String line = "";
        StringBuffer blzRspXml = new StringBuffer();
        System.out.println("��ȡ��������:");
        while((line = br.readLine()) != null){
            //��ȡ�������ݣ����ж�ȡ
            System.out.println(line.trim());
            blzRspXml.append(line.trim());
        }
    }

    public static void main(String args[]){

        //Ŀ���������ַ
        // String url1 = "http://10.14.30.242:9080/RES/Rule";
        String url = "http://47.100.108.80:9200";
        //���͵ı���
        String data1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><CardRequest><SEQ_TIME_STAMP>2014325170152799504</SEQ_TIME_STAMP><TYPE>1</TYPE><v_101>-999998</v_101><v_102>0.002740</v_102><v_109>111.11</v_109></CardRequest>";
        try {
            UrlGetData.callBlaze(url,data1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}