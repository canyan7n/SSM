package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 根据部门id获取部门信息
     * @param deptId
     * @return
     */
    Dept getDeptById(@Param("deptId") Integer deptId);

    /**
     * 通过分步，查询员工信息及部门信息
     * 第二步查询部门信息
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 根据部门id查询部门信息及其员工
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);
    /**
     * 通过分步，查询部门信息及部门的员工
     * 第一步查询部门信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
