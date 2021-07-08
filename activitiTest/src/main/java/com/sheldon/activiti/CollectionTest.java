package com.sheldon.activiti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/27 6:26
 */
public class CollectionTest {
    public static void main1(String[] args) {
        List<String> list = new ArrayList<>(30);
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("苹果");
        list.add("李子");
        list.add("杏仁");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        list.add("香蕉");
        List<String> linkList = new LinkedList<>();
        linkList.add("香蕉");
        linkList.add("苹果");
        linkList.add("李子");
        linkList.add("杏仁");
        linkList.add("香蕉");
        linkList.add("香蕉");
        System.out.println(linkList);
        Set<String> set = new HashSet<>();
        set.add("香蕉");
        set.add("苹果");
        set.add("杏仁");
        set.add("李子");
        set.add("香蕉");
        set.add("香蕉");
        set.add("胡萝卜");
        System.out.println(set);
        Map<String,String> map = new HashMap<>();
        List list1 = new Vector();
        Vector vector = new Vector();
        vector.add("aa");
        vector.add("cc");
        vector.set(0,"bb");
        System.out.println(vector);
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("香蕉");
        list.add("苹果");
        list.add("李子");
        list.add("杏仁");
        list.add("香蕉");
        list.add("香蕉");
        Collection<String> strings = Collections.unmodifiableCollection(list);
        List<String> strings1 = Collections.unmodifiableList(list);
        Map<String,String> map = new HashMap<>();
        map.put("香蕉","100");
        map.put("杏仁","100");
        map.put("李子","100");
        map.put("苹果","100");
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
      Set<String> set = new HashSet();
      set.add("香蕉");
      set.add("香蕉");
      set.add("香蕉");
        Collection collection = Collections.unmodifiableCollection(set);
        // strings.remove("香蕉");
        System.out.println(unmodifiableMap);
        System.out.println(collection);
        System.out.println(strings);
        System.out.println(strings1);
    }
}
