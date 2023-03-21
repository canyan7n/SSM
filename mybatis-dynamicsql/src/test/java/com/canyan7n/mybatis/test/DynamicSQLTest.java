package com.canyan7n.mybatis.test;

import com.canyan7n.mybatis.mapper.DynamicSQLMapper;
import com.canyan7n.mybatis.pojo.Emp;
import com.canyan7n.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :DynamicSQLTest
 * @date ：2023/3/21 16:08
 * @description：TODO
 */
public class DynamicSQLTest {

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, null, null, "男");
        Emp emp2 = new Emp(null, null, 20, "男");
        Emp emp3 = new Emp(null, null, 20, "null");
        List<Emp> list = mapper.getEmpByCondition(emp3);
        System.out.println(list);
    }

    @Test
    public void testInserMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "小明1", 20, "男");
        Emp emp2 = new Emp(null, "小明2", 20, "男");
        Emp emp3 = new Emp(null, "小明3", 20, "男");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);
    }

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        mapper.deleteMoreEmp(new Integer[]{5,6});
    }
}
