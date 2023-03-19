package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

    /**
     * 根据员工id查询员工信息
     * @param emp_id
     */
    Emp getEmpById(@Param("emp_id") int emp_id);
}
