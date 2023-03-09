package com.canyan7n.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.compiler.ast.Variable;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/9 19:40
 */
public class GetSessionUtil {

    public SqlSession getSession(){

        InputStream is = null;
        SqlSession sqlSession = null;
        try {
            is  = Resources.getResourceAsStream("spring-mybatis.xml");
            sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sqlSession;
    }
}
