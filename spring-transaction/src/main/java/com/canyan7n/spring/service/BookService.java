package com.canyan7n.spring.service;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/15 23:03
 */
public interface BookService {

    /**
     * 买书
     * @author: macheng
     * @param userId
     * @param bookId
     * @return void
     */
    public void buyBook(Integer userId,Integer bookId);
}
