package com.eugene.jwttoken.model;

public class User {

    private Integer userId;
    private Integer age;
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(Integer userId, Integer age, String userName) {
        this.userId = userId;
        this.age = age;
        this.userName = userName;
    }
}
