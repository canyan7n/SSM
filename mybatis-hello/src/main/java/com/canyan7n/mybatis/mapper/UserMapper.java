package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.User;

public interface UserMapper {

    public int insertUser();

    public int updataUser();

    public void selectUser();

    public int deleteUser();

    public User getUserById();


}
