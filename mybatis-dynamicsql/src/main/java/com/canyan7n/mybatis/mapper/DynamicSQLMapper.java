package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.*;

public interface DynamicSQLMapper {

    /**
     * 根据条件获取员工信息
     * @return
     */
    List<Emp> getEmpByCondition(@Param("emp") Emp emp);

    /**
     * 批量插入员工信息
     * @param emps
     * @return
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除员工信息
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
