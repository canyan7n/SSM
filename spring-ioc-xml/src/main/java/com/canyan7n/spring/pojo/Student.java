package com.canyan7n.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 10:13
 */
public class Student {

    private Integer sId;

    private String sName;

    private String sGender;

    private Integer sGrade;

    private Clazz sClazz;

    private String sHobby[];

    private Map<String,Teacher> teacherMap;

    public Student() {
    }

    public Student(Integer sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
        System.out.println("Bean生命周期1：依赖注入");
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public Integer getsGrade() {
        return sGrade;
    }

    public void setsGrade(Integer sGrade) {
        this.sGrade = sGrade;
    }

    public Clazz getsClazz() {
        return sClazz;
    }

    public void setsClazz(Clazz sClazz) {
        this.sClazz = sClazz;
    }

    public String[] getsHobby() {
        return sHobby;
    }

    public void setsHobby(String[] sHobby) {
        this.sHobby = sHobby;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sGender='" + sGender + '\'' +
                ", sGrade=" + sGrade +
                ", sClazz=" + sClazz +
                ", sHobby=" + Arrays.toString(sHobby) +
                ", teacherMap=" + teacherMap +
                '}';
    }

//    初始化方法
    public void initMethod(){
        System.out.println("Bean生命周期2：初始化");
    }

//    销毁方法
    public void destroyMethod(){
        System.out.println("bean生命周期3：销毁");
    }
}
