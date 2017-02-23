package com.hlju.classloader;

/**
 * Created by Sole on 2017/2/16.
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }
    public static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}
