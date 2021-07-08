package com.sheldon.activiti.service;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author sheldon
 * 描述： 测试题
 * @date 2021/7/7 11:06
 */
public class Test {
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
        int number = 123456789;
        Stack<Integer> transfer = transfer(number);
        System.out.println(transfer);
        if (transfer.size() > 9) {
            throw new RuntimeException("超出程序处理的范围");
        }
        String s = getResult(transfer);
        System.out.println(s);

    }


    /**
     * 将数字转换为单个字符存入到栈中
     *
     * @param n
     * @return
     */
    public static Stack<Integer> transfer(int n) {
        Stack<Integer> st = new Stack<Integer>();
        //余数
        int division = 0;
        while (n >= 10) {
            division = n % 10;
            st.push(division);
            n = n / 10;
        }
        //将最高位压栈
        st.push(n);
        return st;
    }

    /**
     * 将栈里面的数据安装后进先出的顺序取出
     *
     * @param transfer
     * @return
     */
    public static String getResult(Stack<Integer> transfer) {
        int size = transfer.size();
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (!transfer.empty()) {
            Integer pop = transfer.pop();
            //数字
            String s1 = hp1.get(pop);
            //单位
            String s2 = hp2.get(size);
            //如果当前数字不是零，向sb里面添加数字和单位
            if (pop != 0) {
                sb.append(s1).append(s2);
                i = 1;
            }
            //如果当前数字是零，判断是第几个零，如果前面已经有零，不在添加
            else {
                if (i == 1) {
                    sb.append(s1);
                    i++;
                }
            }
            size--;
        }
        sb.append("元");
        return sb.toString();
    }

}
