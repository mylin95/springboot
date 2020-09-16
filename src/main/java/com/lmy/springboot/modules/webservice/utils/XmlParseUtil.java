package com.lmy.springboot.modules.webservice.utils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class XmlParseUtil {

    /**
     * 简单xml to javabean, 只封装简单节点， 即节点下是文本, 适用于一层节点的xml ， 简单的将xml节点的值赋予对象
     * @param xml 需解析xml
     * @param cla javabean类型 要求必须得有无参构造器
     * @param complexNodeName 复杂类型节点名称，此参数用于不对复杂节点进行封装
     * @param <T>
     * @return 封装后的javabean对象
     */
    public static <T> T simpleXmltoBean(String xml, Class<T> cla, String... complexNodeName) {
        Document document;
        T t;
        try {
            document = DocumentHelper.parseText(xml);
            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements();
            List<String> complexNames = Arrays.asList(complexNodeName);
            t = cla.newInstance();
            for (Element element : elements) {
                String name = captureName(element.getName());
                String value = element.getTextTrim();
                if (complexNames.contains(name)) {
                    continue;
                }
                Field filed = cla.getDeclaredField(name);
                filed.setAccessible(true);
                filed.set(t, value);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return t;
    }

    /**
     * 首字母小写
     * @param name
     * @return
     */
    public static String captureName(String name) {
        name = name.substring(0, 1).toLowerCase() + name.substring(1);
        return name;

    }

}
