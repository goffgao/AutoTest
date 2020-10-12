package com.gao.struct;

public class BreakDemo {
    public static void main(String[] args) {
        int i =0;
        while (i<100){
            i++;
            System.out.println(i);
            if (i == 30){
                //强制中断
                break;
            }
        }
        System.out.println(i);
    }
}
