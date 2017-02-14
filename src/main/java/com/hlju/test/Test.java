package com.hlju.test;

import java.io.PrintStream;

/**
 * Created by Sole on 2017/2/14.
 */
public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        Thread t = new Thread();
        t.start();
    }

    public static void method(final int a, final int b) {
        PrintStream myStream = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if (x.charAt(0) == 'a') {
                    super.print(x.substring(0,2) + a * 10 + ",");
                } else {
                    super.print(x.substring(0,2) + b * 20);
                }
            }
        };
        System.setOut(myStream);
    }
}


