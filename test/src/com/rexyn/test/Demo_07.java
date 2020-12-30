package com.rexyn.test;

import java.util.Optional;

/**
 * @ClassName: Demo_07
 * @Author: sheldon
 * @Date: 2020/12/11
 * @Description:
 */
public class Demo_07 {
    public static void main(String[] args) {
        System.out.println(
                Optional.ofNullable(new Person())
                        .map(x->x.country)
                        .map(x->x.province)
                        .map(x->x.city)
                        .map(x->x.name)
                        .orElse("NAN")
        );
        Person person = new Person(
                new Country(
                        new Province(
                                new City("chengdu")
                        )
                )
        );

        System.out.println(
                Optional.ofNullable(person)
                        .map(x->x.country)
                        .map(x->x.province)
                        .map(x->x.city)
                        .map(x->x.name)
                        .orElse("NAN")
        );

    }
}
class Person{
    Country country;

    public Person() {
    }

    public Person(Country country) {
        this.country = country;
    }
}
class Country{
    Province province;

    public Country(Province province) {
        this.province = province;
    }
}
class Province{
    City city;

    public Province(City city) {
        this.city = city;
    }
}
class City{
    String name;

    public City(String name) {
        this.name = name;
    }
}
