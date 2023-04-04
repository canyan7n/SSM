package com.canyan7n.spring.jdbctest;

import com.canyan7n.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/16 10:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-tx-annotation.xml")
public class TxByAnnotationTest {

    @Autowired
    private BookController bookController;
    @Test
    public void testByBook(){
        bookController.buyBook(1,1);
    }
}
