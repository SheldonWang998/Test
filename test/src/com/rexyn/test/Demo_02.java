package com.rexyn.test;

import com.rexyn.test.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

/**
 * @ClassName: Demo_02
 * @Author: sheldon
 * @Date: 2020/12/1
 * @Description:
 */
public class Demo_02 {
    public static void main(String[] args) {
        //对列表/数组中的每一个元素都乘以2

        int[] ints = new int[]{1,2,5,10};
        int[] array = Arrays.stream(ints).map(i -> i * i).toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] ia = range(1, 10).map(i -> i * 2).toArray();
        for (int i = ia.length - 1; i >= 0; i--) {
            System.out.println(ia[i]);
        }
        List<Integer> result = range(1, 10).map(i -> i * 2).boxed().collect(Collectors.toList());
        System.out.println(result);

        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setUserId(1);
        user.setUsername("sheldon");
        user.setPassword("123456");
        userList.add(user);
        Map<Integer, String> map = userList.stream().filter(i -> i.getUserId() != null).collect(Collectors.toMap(User::getUserId, User::getUsername));
        System.out.println(map);
    }
}
