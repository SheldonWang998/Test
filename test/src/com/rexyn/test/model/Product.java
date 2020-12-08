package com.rexyn.test.model;

import java.util.List;

/**
 * @ClassName: Proudct
 * @Author: sheldon
 * @Date: 2020/12/8
 * @Description:
 */
public class Product {
    private Integer id;//编号
    private Integer pid;//上级编号
    private String pName;//产品名称
    private List<Product> children;//下级集合

    public Product(Integer id, Integer pid, String pName, List<Product> children) {
        this.id = id;
        this.pid = pid;
        this.pName = pName;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pid=" + pid +
                ", pName='" + pName + '\'' +
                ", children=" + children +
                '}';
    }

    public List<Product> getChildren() {
        return children;
    }

    public void setChildren(List<Product> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
