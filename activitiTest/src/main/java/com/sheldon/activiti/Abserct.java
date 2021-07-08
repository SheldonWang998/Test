package com.sheldon.activiti;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/26 10:52
 */
public abstract class Abserct {
    private String name;
    private int age;
    private String like;
public abstract String fly();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
