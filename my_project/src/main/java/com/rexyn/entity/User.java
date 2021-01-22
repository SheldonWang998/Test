package com.rexyn.entity;

import java.io.Serializable;

/**
 * 用户信息表(User)实体类
 *
 * @author makejava
 * @since 2021-01-19 14:39:46
 */
public class User implements Serializable {
    private static final long serialVersionUID = -32829211295331657L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 姓名
    */
    private String username;
    /**
    * 年龄
    */
    private Integer age;
    /**
    * 地址
    */
    private String address;
    /**
    * 性别
    */
    private String sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}