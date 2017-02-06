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
    }

    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }

}