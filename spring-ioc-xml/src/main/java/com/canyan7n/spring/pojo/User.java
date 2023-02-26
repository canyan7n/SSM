package com.canyan7n.spring.pojo;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/26 11:49
 */
public class User {

    private Integer uID;

    private String uName;

    public User() {
    }

    public User(Integer uID, String uName) {
        this.uID = uID;
        this.uName = uName;
    }

    public Integer getuID() {
        return uID;
    }

    public void setuID(Integer uID) {
        this.uID = uID;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Override
    public String toString() {
        return "User{" +
                "uID=" + uID +
                ", uName='" + uName + '\'' +
                '}';
    }
}
