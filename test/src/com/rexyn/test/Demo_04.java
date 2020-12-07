package com.rexyn.test;

import java.lang.reflect.*;

/**反射练习
 * @ClassName: Demo_04
 * @Author: sheldon
 * @Date: 2020/12/7
 * @Description:
 */
public class Demo_04 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.rexyn.test.model.User");
        //aClass的全路径名称com.rexyn.test.model.User
        //System.out.println(aClass.getName());
//        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
//        int length = declaredConstructors.length;
//        System.out.println(length);
//        for (int i = 0; i < declaredConstructors.length; i++) {
//            //构造方法名称
//            System.out.println(declaredConstructors[i].getName());
//        }
//        Field[] declaredFields = aClass.getDeclaredFields();
//        System.out.println(declaredFields.length);
//        for (int i = 0; i < declaredFields.length; i++) {
//            //属性
//            System.out.println(declaredFields[i].getName());
//        }
//        Method[] methods = aClass.getMethods();
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        System.out.println(declaredMethods.length);
//        for (int i = 0; i < declaredMethods.length; i++) {
//
//            //方法
//            System.out.println(declaredMethods[i].getName());
//            //方法的参数个数、类型
//            Method declaredMethod = declaredMethods[i];
//            Parameter[] parameters = declaredMethod.getParameters();
//            System.out.println("参数的个数"+parameters.length);
//            for (Parameter parameter : parameters) {
//                Type parameterizedType = parameter.getParameterizedType();
//                String typeName = parameterizedType.getTypeName();
//                System.out.println(typeName);
//                System.out.println("参数的类型是"+ parameterizedType);
//            }
//
//        }
//        int length1 = methods.length;
//        System.out.println(length1);
//        for (int i = 0; i < methods.length; i++) {
//            //方法
//            System.out.println(methods[i].getName());
//        }
        Class<?> aClass1 = Class.forName("java.lang.String");
        Method method = aClass.getMethod("setUsername", aClass1);
        Object instance = aClass.getDeclaredConstructor().newInstance();
        Object sheldon = method.invoke(instance, "sheldon");
        System.out.println(instance);
    }
}
