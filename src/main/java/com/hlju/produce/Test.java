package com.hlju.produce;

/**
 * Created by Sole on 2017/2/7.
 */
public class Test {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        int i = 0;

        array[i++] = 0;

     //   array[++i] = 0;



        for (int j : array) {
            System.out.println(j);
        }

        int r = 2;
        int a = array[r--];
        System.out.println(a);
    }

}
