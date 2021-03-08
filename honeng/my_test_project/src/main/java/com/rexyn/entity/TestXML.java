package com.rexyn.entity;

import java.util.List;

/**
 * @author sheldon
 * 描述：
 * @date 2021/5/11 14:12
 */
public class TestXML {

    private Integer id;
    private List<List<Integer>> testList;
    private String orderBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<List<Integer>> getTestList() {
        return testList;
    }

    public void setTestList(List<List<Integer>> testList) {
        this.testList = testList;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
