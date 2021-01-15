package com.rexyn.test;

import com.rexyn.test.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: Demo_05
 * @Author: sheldon
 * @Date: 2020/12/8
 * @Description: 泛型练习
 */
public class Demo_05 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, 0, "第一级", new ArrayList<Product>());
        Product product2 = new Product(2, 1, "第一级", new ArrayList<Product>());
        Product product3 = new Product(3, 1, "第一级", new ArrayList<Product>());
        Product product4 = new Product(4, 1, "第二级", new ArrayList<Product>());
        Product product5 = new Product(5, 1, "第二级", new ArrayList<Product>());
        Product product6 = new Product(6, 5, "第三级", new ArrayList<Product>());
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
//        Product product = products.stream().min((o1, o2) -> {
//            if (o1.getPid() > o2.getPid()) return 1;
//            else if (o1.getPid() < o2.getPid()) return -1;
//            else return 0;
//        }).get();
//        System.out.println(product);
//        List<Product> build = Tree.build(products);
//        System.out.println(build);




//        products.sort(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o2.getId()-o1.getId();
//            }
//        });
//        for (Product product : products) {
//            System.out.println(product);
//        }


        List<Product> collect = products.stream().filter(
                item -> item.getId() % 2 == 0
        ).collect(Collectors.toList());
        Product product = products.stream().filter(
                item -> item.getId() % 3 > 1
        ).min(
                (item1, item2) -> item1.getId() - item2.getId()
        ).get();
        System.out.println(product);
//        System.out.println(collect);
    }
}
