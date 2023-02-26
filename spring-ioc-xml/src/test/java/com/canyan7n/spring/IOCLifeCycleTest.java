package com.canyan7n.spring;

import com.canyan7n.spring.pojo.Student;
import com.canyan7n.spring.pojo.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 11:14
 */
public class IOCLifeCycleTest {
    @Test
    public void testIOCLifecycle(){
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        Student bean = ioc.getBean(Student.class);
        System.out.println(bean);
        ioc.close();
    }
}
