package com.hlju.test;

/**
 * Created by Sole on 17/2/4.
 */
public class GenericTest {

    public static void main(String[] args) {
        Box<String> name = new Box<>("corn");
        System.out.println(name.getData());

        Box<Integer> age = new Box<>(123);
        System.out.println(age.getData());

        System.out.println(name.getClass() == age.getClass());          //true

        getData(name);
        getData(age);

        getData2(age);
        getData3(age);

    }

    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }

    public static void getData2(Box<? extends Number> data) {
        System.out.println("data :" + data.getData());
    }

    public static void getData3(Box<? super Integer> data) {
        System.out.println("data :" + data.getData());
        System.out.println("Hello My World");
        System.out.println("Hello World!");
    }

}
