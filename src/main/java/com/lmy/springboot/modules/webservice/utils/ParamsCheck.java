package com.lmy.springboot.modules.webservice.utils;

import com.lmy.springboot.modules.webservice.anno.ParamsNotNull;

import java.lang.reflect.Field;

/*
*
* 此类可用于对接口参数进行效验
* */
public class ParamsCheck {

    /**
     *
     * @param cla 效验类型
     * @param t   效验类型对象
     *
     * 此方法与@ParamsNotNull 结合使用
     */
    public static <T> void checkParamsIsNull(Class<T> cla, T t) throws IllegalAccessException {
        Field[] fs = cla.getDeclaredFields();
        for (Field filed : fs) {
            ParamsNotNull anno = filed.getAnnotation(ParamsNotNull.class);
            if (anno != null) {
                filed.setAccessible(true);
                Object value = filed.get(t);
                if (value == null || value.toString().isEmpty() || value.equals("null")) {
                    throw new IllegalArgumentException(filed.getName() + "字段不能为空!");
                }
            }
        }

    }
}
