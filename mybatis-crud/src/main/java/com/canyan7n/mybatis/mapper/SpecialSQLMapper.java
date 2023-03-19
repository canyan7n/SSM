package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;
import java.util.*;
public interface SpecialSQLMapper {

    /**
     * 根据id批量删除用户
     * @param ids
     */
    void deleteMoreById(@Param("ids") String ids);

    /**
     * 动态设置表明查询用户
     * @param tableName
     */
    List getAllUserByTabName(String tableName);

    /**
     * 添加用户并获取自增主键
     * @param user
     */
    void insertUser(User user);

}
