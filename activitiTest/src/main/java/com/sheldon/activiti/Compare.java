package com.sheldon.activiti;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/26 7:07
 */
public class Compare {
    public static void main(String[] args) {

            String s1 = "通话";
            String s2 = "重地";
            // System.out.println(s1.hashCode());
            // System.out.println(s2.hashCode());
            // int i = s2.indexOf("地");
            // System.out.println(i);
            // List<String> list = new ArrayList<>();
            // Object[] objects = list.toArray();
            // String[] s = new String[10];
            // List<String> strings = Arrays.asList(s);
        // int test = test();
        // System.out.println(test);
        User user = new User("sheldon",29,"nanchong",1);
        User user1 =new User();



    }
    public static int test(){
        try {
            int a = 0;
            int b= 10;
            int c = b/a;
            return c;
        } catch (Exception e) {
           int a = 10;
           return a;
        } finally {
            int a = 20;
            return a;
        }
    }

    // public static void main(String[] args) {
    //     int[] ints = {1, 5, 700, 36, 500, 300, 23, 56, 98, 2, 1};
    //
    //     //求最大值
    //     for (int k =0 ; k < ints.length; k++) {
    //     int max = ints[k];
    //     int j = k;
    //     for (int i = k+1; i < ints.length; i++) {
    //         if(ints[i] > max){
    //             max = ints[i];
    //             j = i;
    //         }
    //     }
    //     if(j != k){
    //         ints[j] =ints[k];
    //         ints[k] = max;
    //     }
    //         System.out.println(Arrays.toString(ints));
    //     }
    //     //简单排序
    //
    //     // 冒泡排序
    //     // int e;
    //     // for (int j = 0; j < ints.length; j++) {
    //     //     for (int i = 1; i < ints.length-j; i++) {
    //     //         if (ints[i - 1] > ints[i]) {
    //     //             e = ints[i];
    //     //             ints[i] = ints[i - 1];
    //     //             ints[i - 1] = e;
    //     //         }
    //     //     }
    //     //     System.out.println(Arrays.toString(ints));
    //     // }
    // }
}
