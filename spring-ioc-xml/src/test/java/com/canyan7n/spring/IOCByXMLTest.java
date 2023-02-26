package com.canyan7n.spring;

import com.canyan7n.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 10:15
 */
public class IOCByXMLTest {

    @Test
    public void testStudentByIoc(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        /**
         * 获取bean的三种方式
         * 1.类的类型 | 继承的父类 | 接口的实现类
         * 2.bean id
         * 3.bean id 加 类类型
         */
        //类类型获取bean
        Student bean = ioc.getBean("studentOne",Student.class);
        System.out.println(bean);

        //beanId+类类型获取bean
//        Student bean1 = ioc.getBean("studentOne",Student.class);
//        System.out.println(bean1);

        Student studentTwo = ioc.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);
    }
}
