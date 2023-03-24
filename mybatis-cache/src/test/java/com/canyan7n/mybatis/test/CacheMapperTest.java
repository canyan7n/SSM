package com.canyan7n.mybatis.test;

import com.canyan7n.mybatis.mapper.CacheMapper;
import com.canyan7n.mybatis.pojo.Emp;
import com.canyan7n.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :CacheMapperTest
 * @date ：2023/3/24 17:39
 * @description：TODO
 */
public class CacheMapperTest {

    @Test
    public void testGetEmpByEmpId(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //自动提交事务
        SqlSession sqlSession1= sqlSessionFactory.openSession(true);
        SqlSession sqlSession2= sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpByEmpId(1);
        System.out.println(emp1);
        //插入数据，一级缓存自动清空
//        Emp emp = new Emp(null, "小明4", 20, "男");
//        mapper1.insertEmp(emp);
        //清空sqlsession1的一级缓存
        sqlSession1.clearCache();
        Emp emp = mapper1.getEmpByEmpId(1);
        System.out.println(emp);
        //不同的sqlsession
//        Emp emp2 = mapper2.getEmpByEmpId(1);
//        System.out.println(emp2);
    }

    @Test
    public void testGetEmpByEmpId02(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory1 = sqlSessionFactoryBuilder.build(is);
//        SqlSessionFactory sqlSessionFactory2 = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession1 = sqlSessionFactory1.openSession(true);
        SqlSession sqlSession2 = sqlSessionFactory1.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpByEmpId(1);
        System.out.println(emp1);
        //关闭sqlSession1，使一级缓存生效
        sqlSession1.close();
        //再次查询，命中二级缓存
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpByEmpId(1);
        System.out.println(emp2);
    }
}
