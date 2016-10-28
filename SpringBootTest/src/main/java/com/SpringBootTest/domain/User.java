package com.SpringBootTest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lich on 10/24/16.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    public User(){}

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @Column(nullable = false)
//    private Integer userId;
//
//    @Column(nullable = false)
//    private String email;
//
//    @Column(nullable = false)
//    private String userName;
//
//    @Column(nullable = false)
//    private String password;
//
//    @Column(nullable = false)
//    private Integer phoneNumber;
//
//    @Column(nullable = false)
//    private Boolean isAdmin;
//
//    @Column(nullable = false)
//    private Boolean isDelete;
//
//    // 构造函数
//    public User() {
//    }
//
//    public User(Integer userId, String email, String userName, String password, Integer phoneNumber, Boolean isAdmin, Boolean isDelete) {
//        this.userId = userId;
//        this.email = email;
//        this.userName = userName;
//        this.password = password;
//        this.phoneNumber = phoneNumber;
//        this.isAdmin = isAdmin;
//        this.isDelete = isDelete;
//    }
//
//    // getter和setter
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Integer getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(Integer phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Boolean getAdmin() {
//        return isAdmin;
//    }
//
//    public void setAdmin(Boolean admin) {
//        isAdmin = admin;
//    }
//
//    public Boolean getDelete() {
//        return isDelete;
//    }
//
//    public void setDelete(Boolean delete) {
//        isDelete = delete;
//    }
}

