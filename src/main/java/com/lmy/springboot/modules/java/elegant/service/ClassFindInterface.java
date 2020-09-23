package com.lmy.springboot.modules.java.elegant.service;

import org.apache.poi.ss.formula.functions.T;

/**
 * @Package: com.lmy.springboot.modules.java.elegant.service
 * @Description:
 * @Author: linmy
 * @Date: 2020/9/23
 */
@FunctionalInterface
public interface ClassFindInterface {


    /**
     * 类名未找到的简写接口
     * @param className
     * @return
     * @throws ClassNotFoundException
     */
    Class<T> classNameToClass(String className) throws ClassNotFoundException ;
}
