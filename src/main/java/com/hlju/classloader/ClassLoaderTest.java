package com.hlju.classloader;

/**
 * Created by Sole on 2017/2/10.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        System.out.println("count1 = " + Singleton.count1);
        System.out.println("count2 = " + Singleton.count2);

    }

}

class Singleton {
    //private static Singleton singleton = new Singleton();
    public static int count1;
    public static int count2 = 0;
    private static Singleton singleton = new Singleton();

    private Singleton() {
        count1++;
        count2++;
    }

    public static Singleton getInstance() {
        return singleton;
    }

}