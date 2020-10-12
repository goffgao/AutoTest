package com.gao.method;

import javax.sound.midi.Soundbank;

public class Demo06 {

    public static void main(String[] args) {
        System.out.println(f(4));
    }
    //阶乘
    //1! 1
    //2! 2*1
    //31 3*2*1
    //4! 4*3*2*1
    //5! 5*4*3*2*1
    public static int f(int n){
        if (n==1){
//            System.out.println("打印N"+n);
            return 1;
        }else {
            //4* f方法本身 等于 f(4-1) f(3)的时候再去调用一次方法本身  最后就是 4*3*2*1
            return n*f(n-1);

        }
    }
}
