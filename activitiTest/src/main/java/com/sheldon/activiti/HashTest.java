package com.sheldon.activiti;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sheldon
 * 描述：测试两个对象的hashCode相同，但是equlas不为true
 * @date 2021/6/26 9:06
 */
public class HashTest {
    public final static void main(String[] args) {
        // Set<User2> hashSet = new HashSet<>();
        // HashSet hashSet = new HashSet();
        // User user1 = new User();
        // user1.setAddress("abcd");
        // user1.setAge(2);
        // user1.setUsername("zs");
        // user1.setSex(0);
        // User user2 = new User("zs",2,"abcd",0);
        // User2 user2 = new User2();
        // user2.setI(2);
        // User2 user1 = new User2();
        // user1.setI(12);
        // hashSet.add(user2);
        // hashSet.add(user1);
        // System.out.println(user1.hashCode());
        // System.out.println(user2.hashCode());
        // System.out.println(user1.hashCode() == user2.hashCode());
        // System.out.println(user1.equals(user2));
        // System.out.println(hashSet);
        // long round = Math.round(-1.1);
        // long round1 = Math.round(-1.9);
        // System.out.println(round);
        // System.out.println(round1);
       // final User user = new User("22",22,"ss",1);
       //  System.out.println(user);
       //  if(user.age >18){
       //      System.out.println(user.age);
       //      System.out.println(user.getAge());
       //      user.setAge(user.getAge()%10);
       //      user.setUsername("mmm");
       //  }
       //
       //
       //  System.out.println(user);
       //  String s = "Hello, sheldon.wang";
       //  StringBuffer sb= new StringBuffer(s);
       //  String s1 = sb.reverse().toString();
       //  System.out.println(s1);
       //  StringBuilder stringBuilder = new StringBuilder(s);
       //  String s2 = stringBuilder.reverse().toString();
       //  System.out.println(s2);
        Abserct abserct = new AbserctImpl();
        abserct.setAge(102);
        String fly = abserct.fly();
        System.out.println(fly);

    }

}
