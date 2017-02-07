package com.hlju.threadLocal;

/**
 * Created by Sole on 2017/2/7.
 */
public class Student {

    private int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
