package com.lmy.springboot.modules.java.elegant.service.impl;

import com.lmy.springboot.modules.java.elegant.service.ClassFindInterface;
import lombok.extern.slf4j.Slf4j;

/**
 * @Package: com.lmy.springboot.modules.java.elegant.service.impl
 * @Description:
 * @Author: linmy
 * @Date: 2020/9/23
 */
@Slf4j
public class ClassFindInterfaceImpl{

    public Class classFind(ClassFindInterface classFindInterface, String className) {
        Class<?> clazz = null;
        try {
            clazz = classFindInterface.classNameToClass(className);
        } catch (ClassNotFoundException e) {
            log.error("Class.forName的类名找不到：{}", className);
            e.printStackTrace();
        }
        return clazz;
    }
}
