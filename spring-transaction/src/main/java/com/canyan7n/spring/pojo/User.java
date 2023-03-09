package com.canyan7n.spring.pojo;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/9 17:33
 */
public class User {

    private Integer uid;

    private String uName;

    private String uPassword;

    private String uAge;

    private String uGender;

    private String uEmail;

    public User() {
    }

    public User(Integer uid, String uName, String uPassword, String uAge, String uGender, String uEmail) {
        this.uid = uid;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uAge = uAge;
        this.uGender = uGender;
        this.uEmail = uEmail;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuAge() {
        return uAge;
    }

    public void setuAge(String uAge) {
        this.uAge = uAge;
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }
}
