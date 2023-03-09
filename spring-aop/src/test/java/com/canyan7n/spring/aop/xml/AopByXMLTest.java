package com.canyan7n.spring.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/9 0:45
 */
public class AopByXMLTest {
    @Test
    public void testAopByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,1);
    }
}
