package com.canyan7n.mybatis.mapper;

import com.canyan7n.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;
import java.util.*;

public interface EmpMapper {

    /**
     * 根据员工id查询员工信息
     * @param emp_id
     */
    Emp getEmpById(@Param("emp_id") int emp_id);

    /**
     * 根据员工id查询员工信息及部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptById(@Param("empId") Integer empId);

    /**
     * 通过分步，根据员工id查询员工信息及部门信息
     * 第一步查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpandDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分步，查询部门信息及其员工
     * 第二部通过员工id查询员工信息
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
