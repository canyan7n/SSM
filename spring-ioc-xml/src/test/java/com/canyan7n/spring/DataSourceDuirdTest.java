package com.canyan7n.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 11:34
 */
public class DataSourceDuirdTest {

    @Test
    public void testDataSource(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource druidDataSource = ioc.getBean(DruidDataSource.class);
        try{
            System.out.println(druidDataSource.getConnectCount());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
