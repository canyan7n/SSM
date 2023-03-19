package com.canyan7n.mybatis.mapper;
import org.apache.ibatis.annotations.Param;

import java.util.*;

public interface SelectLikeMapper {
    /**
     * 根据用户名模糊查询用户信息
     * @return
     */
    List getUserByLike(@Param("mohu") String mohu);
}
