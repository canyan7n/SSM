package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

   int insertUser();

   void updataUser();

   User getUserById();

   List<User> getAllUser();


}
