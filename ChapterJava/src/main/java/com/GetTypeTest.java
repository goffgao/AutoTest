package com;


import java.util.ArrayList;

import static com.GetType.getType;


public class GetTypeTest {



    public static void main(String[] args) {
        int[] a = new int[10];

        int[] b = {1,2,3,4};
        ArrayList<String> test = new ArrayList<>();
        int c =10;
        System.out.println(getType(a));
        System.out.println(getType(c));
        System.out.println(getType(test));
        System.out.println();
    }


}
