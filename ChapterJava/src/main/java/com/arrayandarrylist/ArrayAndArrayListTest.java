package com.arrayandarrylist;

import java.util.ArrayList;

public class ArrayAndArrayListTest {
    public static void main(String[] args) {
        // array不能赋值为null 或者超出方位 int[3]以外 否则报空指针或者溢出

        int[] array = new int[3]; //动态初始化
        System.out.println(array); //地址
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        // 改变数组元素
        array[0] = 5;
        array[1] = 10;
        array[2] = 20;
        System.out.println(array); //地址
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("================arrayB===================");

        int[] arrayB = new int[3]; //动态初始化
        System.out.println(arrayB); //地址
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);

        // 改变数组元素
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); //地址
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);

        System.out.println("======== arrayA= arrayB======最后的赋值为准=====================");

        int[] arrayC = array;
        System.out.println(arrayC);
        System.out.println(array[2]);
        arrayC[2] = 2000;
        System.out.println(arrayC);
        System.out.println(arrayC[2]);
        System.out.println(array[2]);

        System.out.println("=======array.length=====length判断长度==[这里是从0开始]=");
        System.out.println(arrayC.length);
        int len = array.length;

        System.out.println(len+"len-1="+(len-1)); //因为[从0开始] 所以-1是最大值

        for (int i = 0; i < len; i++) { //打印长度值
            System.out.println(array[i]);
        }


        System.out.println("======== arrayList=====================");
        //ArrayList<E> E是泛型  ,E必须固定类型
        ArrayList<String> list = new ArrayList<String>();
    }
}
