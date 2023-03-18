package com.canyan7n.mybatis.test;
import com.canyan7n.mybatis.mapper.UserMapper;
import com.canyan7n.mybatis.pojo.User;
import com.canyan7n.mybatis.utils.GetSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.io.IOException;
import java.util.List;


public class MybatisTest {

    @Test
    public void testInsert() throws IOException {

        SqlSession sqlSession = new GetSession().getSsesion();
        //获取sqlsession的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int result = mapper.insertUser();
        //提供sqlsession的唯一标识
//        int result = sqlSession.insert(com.canyan7n.mybatis.mapper.UserMapper.insertUser);
        System.out.println("成功：" + result);
//        提交事务
        sqlSession.commit();
        //关闭sqlsession
        sqlSession.close();


    }

    @Test
    public void testUpdata(){
        SqlSession sqlSession = new GetSession().getSsesion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updataUser();
        sqlSession.close();
    }

    @Test
    public void testSelect01(){
        SqlSession sqlSession = new GetSession().getSsesion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testSelect02(){
        SqlSession sqlSession = new GetSession().getSsesion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
        sqlSession.close();
    }
}
