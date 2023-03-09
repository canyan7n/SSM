package com.canyan7n.mybatis.test;

import com.canyan7n.mybatis.mapper.UserMapper;
import com.canyan7n.mybatis.pojo.User;
import com.canyan7n.mybatis.util.GetSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.SequenceInputStream;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/9 19:46
 */
public class MybatisTest {

    @Test
    public void testMybatis(){
        SqlSession session = new GetSessionUtil().getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
//        int result = mapper.insertUser();
//        System.out.println(result);
//        User user = mapper.getUserById();
//        System.out.println(user);
//        int result1 = mapper.deleteUser();
//        System.out.println(result1);
        int result = mapper.updataUser();
        System.out.println(result);
        session.close();
    }
}
