package com.rexyn.test.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Tree
 * @Author: sheldon
 * @Date: 2020/12/8
 * @Description:
 */
public class Tree {
    public static <E extends Product> List<E> build(List<E> list) {
        List<E> treeList = new ArrayList<>();
        E e = list.stream().min((o1, o2) -> {
            if (o1.getPid() > o2.getPid()) return 1;
            else if (o1.getPid() < o2.getPid()) return -1;
            else return 0;

        }).get();

        Integer pid = e.getId();
        treeList = build(list, pid);
        return treeList;
    }

    public static <E extends Product> List<E> build(List<E> totalList, int zero) {
        List<E> list = new ArrayList<>();
        for (E summit : totalList) {
            int parentId = summit.getId();
            if (parentId == zero) {
                list.add(summit);
            }
            for (E total : totalList) {
                int pid = total.getPid();
                if (parentId == pid) {
                    summit.getChildren().add(total);
                }
            }
        }
        return list;
    }
}
