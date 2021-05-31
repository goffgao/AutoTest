package com.array;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        int[] b = new int[10];
        System.out.println(a);

        String s = Arrays.toString(b);
        System.out.println(s);

        String a1 = Arrays.toString(a);
        String[] array = a1.split(",");
        System.out.println(array);
        for (String s1 : array) {
            System.out.println(s1);

        }
    }

}
