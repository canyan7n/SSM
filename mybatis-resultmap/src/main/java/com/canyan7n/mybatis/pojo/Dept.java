package com.canyan7n.mybatis.pojo;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Dept
 * @date ：2023/3/19 11:50
 * @description：TODO
 */
public class Dept {

    private Integer deptId;

    private String deptName;

    public Dept() {
    }

    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
