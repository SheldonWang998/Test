package com.sheldon.activiti.service;

import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/7 14:27
 */
public class Test2 {
    /**
     * 第一个映射表，根据所在位的数值与中文对应汉字
     */
    private static HashMap<Integer, String> hp1 = new HashMap<Integer, String>();

    /**
     * 第二个映射表,根据所在位数，与中文对应单位
     */
    private static HashMap<Integer, String> hp2 = new HashMap<Integer, String>();

    static {
        hp1.put(0, "零");
        hp1.put(1, "一");
        hp1.put(2, "二");
        hp1.put(3, "三");
        hp1.put(4, "四");
        hp1.put(5, "五");
        hp1.put(6, "六");
        hp1.put(7, "七");
        hp1.put(8, "八");
        hp1.put(9, "九");
        hp2.put(1, "");
        hp2.put(2, "十");
        hp2.put(3, "百");
        hp2.put(4, "千");
        hp2.put(5, "万");
        hp2.put(6, "十万");
        hp2.put(7, "百万");
        hp2.put(8, "千万");
        hp2.put(9, "亿");
    }

    public static void main(String[] args) {
        int number = 12223345;
        Queue<Integer> queueString = new ArrayBlockingQueue<>(10);
        Queue<Integer> queueInteger = new LinkedBlockingQueue<>(50);
        int division = 0;
        while (number >= 10) {
            division =number % 10;
            queueString.add(division);
            queueInteger.add(division);
            number = number / 10;
        }
        queueString.add(number);
        queueInteger.add(number);
        System.out.println(queueString);
        System.out.println(queueInteger);
    }
    public static LinkedBlockingQueue<Integer> queue(int n) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        //余数
        int division = 0;
        while (n >= 10) {
            division = n % 10;
            queue.add(division);
            n = n / 10;
        }
        //将最低位最后出
        queue.add(n);
        return queue;
    }

    public static String getResult(LinkedBlockingQueue<Integer> queue) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (int j = queue.size() - 1; j > 0; j--) {
            Integer pop = queue.remove();
            String s1 = hp1.get(pop);
            String s2 = hp2.get(j);
            System.out.println(s1);
            System.out.println(s2);
            sb.append(s1).append(s2);
        }
        sb.append("元");
        return sb.toString();
    }
}
