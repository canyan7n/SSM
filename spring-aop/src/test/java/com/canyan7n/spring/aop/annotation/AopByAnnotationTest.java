package com.canyan7n.spring.aop.annotation;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/5 22:09
 */
public class AopByAnnotationTest {

    @Test
    public void testAopByAnnotation(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,3);
        calculator.sub(1,3);
    }
}
