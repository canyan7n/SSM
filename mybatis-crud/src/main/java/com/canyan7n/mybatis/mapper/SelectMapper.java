package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import java.util.*;
public interface SelectMapper {

    /**
     * 根据用户id获取用户信息
     */
    public User getUserById(@Param("id") int id);

    /**
     * 获取所有用户信息将所有数据（实体类）存入list集合
     * @Param
     * @return
     */
    public List getAllUser();

    /**
     * 根据用户id获取用户信息存入map集合中
     * 字段作为key，字段值作为value
     * @Param
     * @return
     */
    public Map getUserByIdToMap(@Param("id") int id);

    /**
     * 获取所有用户的信息
     * 1.将每一个用户信息存入map，将map存入list
     * 2.将每一个用户信息存入map，将map存入一个大map作为大map的value,用@mapkey注解指定key
     * @Param
     * @return
     */
//    public List<Map<String,Objects>> getAllUserToMap();
    @MapKey("id")
    public Map<String,Objects> getAllUserToMap();
}
