package com.canyan7n.mybatis.test;

import com.canyan7n.mybatis.mapper.EmpMapper;
import com.canyan7n.mybatis.pojo.Emp;
import com.canyan7n.mybatis.pojo.EmpExample;
import com.canyan7n.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.*;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MBGTest
 * @date ：2023/3/25 16:19
 * @description：TODO
 */
public class MBGTest {
    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
        /*Emp emp1 = mapper.selectByPrimaryKey(1);
        System.out.println(emp1);*/
        //查询所有数据
        /*List<Emp> list2 =  mapper.selectByExample(null);
        list2.forEach(System.out::println);*/
        //根据条件查询
        /*EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeEqualTo(20);
        empExample.or().andGenderEqualTo("男");
        List<Emp> list =  mapper.selectByExample(empExample);
        list.forEach(System.out::println);*/
        //普通修改
        /*Emp emp = new Emp(1,"小黑",null,"女",null);
        mapper.updateByPrimaryKey(emp);*/
        //选择性修改
        //null值不会被修改
        Emp emp = new Emp(1,"小黑",null,"女",null);
        mapper.updateByPrimaryKeySelective(emp);
    }
}
