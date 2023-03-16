package com.canyan7n.spring.dao;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/15 23:03
 */
public interface BookDao {
    /**
     * 买书
     * @author: macheng
     * @param bookId
     * @return void
     */


        //根据图id获取图书价格
        Integer getPriceByBookId(Integer bookId);

        //更新图书库存
        void updateStock(Integer bookId);

        //更新用户余额
        void updateBalance(Integer userId, Integer price);
}
