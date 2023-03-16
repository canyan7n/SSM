package com.canyan7n.spring.controller;

import com.canyan7n.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/16 10:16
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }
}
