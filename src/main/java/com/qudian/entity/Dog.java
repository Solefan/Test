package com.qudian.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Sole on 2017/2/23.
 */
@Component
public class Dog implements Serializable {

    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void print() {
        System.out.println("Dog is a dog");
    }
}
