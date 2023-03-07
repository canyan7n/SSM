package com.canyan7n.spring;

import com.canyan7n.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/4 20:59
 */
public class UserTest {

    @Test
    public void testUser(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserController bean = ioc.getBean(UserController.class);
        bean.userSave();
    }
}
