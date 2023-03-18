package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {

    /**
    根据id返回用户
     */
    User getUserById();

    /**
    根据username返回用户
     */
    User getUserByName(String username);

    /**
    验证登录
    根据username和password返回用户
     */
    User checkUserByNamePass(String username, String password);

    /**
    验证登录
    根据map集合返回用户，用户名和密码放在map中
     */
    User checkUserByMap(Map map);

    /**
     * 验证登录
     * 把注解的值作为mybatis的map集合的key，参数为map的value
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    /**
     * 插入数据
     *
     */
    int insertUser(User user);
}
