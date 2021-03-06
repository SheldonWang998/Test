package com.example.demo1.com.sheldon.entity;

import java.io.Serializable;

/**
 * 用户信息表(User)实体类
 *
 * @author makejava
 * @since 2021-01-19 13:37:35
 */
public class User implements Serializable {
    private static final long serialVersionUID = -13105959100528168L;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

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