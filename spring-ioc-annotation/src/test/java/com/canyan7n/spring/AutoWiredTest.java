package com.canyan7n.spring;

import com.canyan7n.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/25 20:31
 */
public class AutoWiredTest {

    @Test
    public void testAutowired(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController bean = ioc.getBean(UserController.class);
        bean.saveUser();
    }
}
