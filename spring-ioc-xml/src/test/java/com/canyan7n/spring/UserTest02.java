package com.canyan7n.spring;

import com.canyan7n.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/4 21:18
 */
public class UserTest02 {

    @Test
    public void testUser(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spirng-ioc-annotation.xml");
        UserController bean = ioc.getBean(UserController.class);
        System.out.println(bean);
//        bean.userSave();
    }
}
