package com.canyan7n.mybatis.test;

import com.canyan7n.mybatis.mapper.SpecialSQLMapper;
import com.canyan7n.mybatis.pojo.User;
import com.canyan7n.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :SpecialSQLMapperTest
 * @date ：2023/3/19 11:11
 * @description：TODO
 */
public class SpecialSQLMapperTest {

    /**
     * 根据id批量删除用户
     * @param
     */
    @Test
    public void testDeleteMoreById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreById("6,7");
    }

    /**
     * 动态设置表明查询用户
     * @param
     */
    @Test
    public void testGetUserByTabName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List list = mapper.getAllUserByTabName("t_user");
        System.out.println(list);
    }

    /**
     * 添加用户并获取自增主键
     * @param
     */
    @Test
    public void testInserUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "qq", "12345", 24, "男", "123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
