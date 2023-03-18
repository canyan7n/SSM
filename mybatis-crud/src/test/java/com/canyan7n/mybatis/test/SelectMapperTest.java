package com.canyan7n.mybatis.test;

import com.canyan7n.mybatis.mapper.SelectMapper;
import com.canyan7n.mybatis.pojo.User;
import com.canyan7n.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/18 13:29
 */
public class SelectMapperTest {

    /**
     * 根据id获取用户信息存入实体类对象
     * @Param
     * @return
     */
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = new SqlSessionUtil().getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    /**
     * 获取所有用户信息将所有数据（实体类）存入list集合
     * @Param
     * @return
     */
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = new SqlSessionUtil().getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List list = mapper.getAllUser();
        for(Object user : list){
            System.out.println(user);
        }

    }
    /**
     * 根据用户id获取用户信息存入map集合中
     * 字段作为key，字段值作为value
     * @Param
     * @return
     */
    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = new SqlSessionUtil().getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map map = mapper.getUserByIdToMap(1);
        System.out.println(map);
    }

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = new SqlSessionUtil().getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Objects>> list = mapper.getAllUserToMap();
//        System.out.println(list);
        Map<String, Objects> map = mapper.getAllUserToMap();
        System.out.println(map);
    }


}
