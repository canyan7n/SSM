package com.canyan7n.mybatis.test;

import com.canyan7n.mybatis.mapper.SelectLikeMapper;
import com.canyan7n.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :SelectLikeMapperTest
 * @date ：2023/3/18 21:40
 * @description：TODO
 */
public class SelectLikeMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectLikeMapper mapper = sqlSession.getMapper(SelectLikeMapper.class);
        List list = mapper.getUserByLike("a");
        System.out.println(list);
    }
}
