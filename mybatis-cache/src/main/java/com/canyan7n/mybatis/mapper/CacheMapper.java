package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    /**
     * 根据员工id获取员工信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 插入一条员工数据
     * @param emp
     */
    void insertEmp(@Param("emp") Emp emp);
}
