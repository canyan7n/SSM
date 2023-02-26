package com.canyan7n.spring;

import com.canyan7n.spring.factorybean.MyFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 11:53
 */
public class FactoryBeanTest {

    @Test
    public void testFatoryBean(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factorybean.xml");
        MyFactoryBean bean = ioc.getBean(MyFactoryBean.class);
        MyFactoryBean bean2 = ioc.getBean(MyFactoryBean.class);
        System.out.println(bean);
        System.out.println(bean2);
    }
}
