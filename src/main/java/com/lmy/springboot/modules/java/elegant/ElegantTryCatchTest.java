package com.lmy.springboot.modules.java.elegant;

import com.lmy.springboot.modules.java.elegant.service.ClassFindInterface;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

/**
 * @Package: com.lmy.springboot.modules.java.elegent
 * @Description:
 * @Author: linmy
 * @Date: 2020/9/23
 */
@Slf4j
public class ElegantTryCatchTest {
    public static void main(String[] args) {

    }

    /**
     * 使用lambda表达式 简写异常处理类
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Test
    public void testForName() throws IllegalAccessException, InstantiationException {
        Class<ElegantTryCatchTest> clazz = classFind(o -> (Class<T>) Class.forName(o), "com.lmy.springboot.modules.java.elegant.ElegantTryCatchTest");
        ElegantTryCatchTest elegantTryCatchTest = clazz.newInstance();
        elegantTryCatchTest.print();
    }

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

    public void print() {
        log.info("hello class");
    }

}
