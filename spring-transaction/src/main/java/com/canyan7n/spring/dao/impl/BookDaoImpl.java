package com.canyan7n.spring.dao.impl;

import com.canyan7n.spring.dao.BookDao;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/15 23:04
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer getPriceByBookId(Integer bookId) {
        String sql = "select bprice from book where bid = ?";
        jdbcTemplate.queryForObject(sql,Integer.class,bookId);
        return null;
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql = "update book set bstock = bstock - 1 where bid = ?";
        jdbcTemplate.update(sql,bookId);
    }

    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update user set ubalance = ubalance - ? where uid = ?";
        jdbcTemplate.update(sql,price,userId);
    }


}
