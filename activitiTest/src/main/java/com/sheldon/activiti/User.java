package com.sheldon.activiti;

import java.util.Objects;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/26 6:52
 */
public class User {
    public String username;
    public int age;
    public String address;
    public int sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) {
    //         return true;
    //     }
    //     if (o == null || getClass() != o.getClass()) {
    //         return false;
    //     }
    //     User user = (User) o;
    //     return age == user.age && sex == user.sex && Objects.equals(username, user.username) && Objects.equals(address, user.address);
    // }

    // @Override
    // public int hashCode() {
    //     // return Objects.hash(username, age, address, sex);
    //     return this.age%10;
    // }

    public User() {
    }

    public User(String username, int age, String address, int sex) {
        this.username = username;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                '}';
    }



}
