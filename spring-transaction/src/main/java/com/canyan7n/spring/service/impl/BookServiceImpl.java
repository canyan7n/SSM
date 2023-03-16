package com.canyan7n.spring.service.impl;

import com.canyan7n.spring.dao.BookDao;
import com.canyan7n.spring.service.BookService;
import com.sun.org.glassfish.external.arc.Taxonomy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/15 23:04
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    @Transactional
    public void buyBook(Integer userId, Integer bookId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书库存
        bookDao.updateStock(bookId);
        //更新用户余额
        bookDao.updateBalance(userId,price);
    }
}
