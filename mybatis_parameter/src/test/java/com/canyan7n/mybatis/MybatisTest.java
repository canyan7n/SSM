package com.canyan7n.mybatis;

import com.canyan7n.mybatis.mapper.UserMapper;
import com.canyan7n.mybatis.pojo.User;
import com.canyan7n.mybatis.utils.SqlSesionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MybatisTest {
    @Test
    public void testSelect01(){
        SqlSession sqlSession = new SqlSesionUtil().getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void testSelect02(){
        SqlSession sqlSession = new SqlSesionUtil().getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName("admins");
        System.out.println(user);
    }

    @Test
    public void testSelect03(){
        SqlSession sqlSession = new SqlSesionUtil().getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkUserByNamePass("admins","123456");
        System.out.println(user);
    }

    @Test
    public void testSelect04(){
        SqlSession sqlSession = new SqlSesionUtil().getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, String> map = new HashMap<>();
        map.put("username","admins");
        map.put("password","123456");
        User user = mapper.checkUserByMap(map);
        System.out.println(user);
    }

    @Test
    public void testSelect05(){
        SqlSession sqlSession = new SqlSesionUtil().getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admins","123456");
        System.out.println(user);
    }

    @Test
    public  void  testInsertUser(){
        SqlSession sqlSession = new SqlSesionUtil().getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(0, "root01", "1234", "30", "男", "1234@153.com");
        int result =  mapper.insertUser(user);
        System.out.println(result);
    }
}