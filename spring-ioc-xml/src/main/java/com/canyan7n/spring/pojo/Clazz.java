package com.canyan7n.spring.pojo;

import java.util.List;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 10:21
 */
public class Clazz {

    private Integer cId;

    private String cName;
    private List<Student> students;

    public Clazz() {
    }

    public Clazz(Integer cId, String cName, List<Student> students) {
        this.cId = cId;
        this.cName = cName;
        this.students = students;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "Clazz{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", students=" + students +
                '}';
    }
}
