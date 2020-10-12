package com.gao.struct;


public class ForDemo05 {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50}; //定义了一个数组
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("===================");
        //增强for循环 x:numbers 简化  等于所有的numbers都赋值给x
        //类似Python for x in numbers:
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
