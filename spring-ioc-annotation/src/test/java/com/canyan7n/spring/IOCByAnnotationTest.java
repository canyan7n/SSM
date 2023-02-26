package com.canyan7n.spring;

import com.canyan7n.spring.controller.UserController;
import com.canyan7n.spring.dao.impl.UserDaoImpl;
import com.canyan7n.spring.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/25 19:22
 */
public class IOCByAnnotationTest {
    @Test
    public void testIOCByAnnotation(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController bean = ioc.getBean(UserController.class);
        Object bean1 = ioc.getBean(UserServiceImpl.class);
        Object bean2 = ioc.getBean(UserDaoImpl.class);
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(bean2);
    }
}
