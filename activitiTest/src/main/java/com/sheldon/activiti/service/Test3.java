package com.sheldon.activiti.service;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/7 23:40
 */
public class Test3 {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);
    }
    public static int getResult(int number){
        int result = 0;
        int sum = 0;
        if(number <= 1){
            sum = number;
        }else {
            sum = number * (number -1);
            result = result *sum;
            number--;
            getResult(number);
        }
       return result;
    }

}
