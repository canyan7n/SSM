package com.canyan7n.spring.jdbctest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/9 10:21
 */
//指定当前测试环境用spring的测试环境，此时可以通过注解来让ioc管理组件
@RunWith(SpringJUnit4ClassRunner.class)
//指定测试环境的配置文件
@ContextConfiguration("classpath:spring-jdbctmplate.xml")
public class JDBCTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testJDBCTemlate(){
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"root","12345","25","女","123456@qq.com");
    }



}
