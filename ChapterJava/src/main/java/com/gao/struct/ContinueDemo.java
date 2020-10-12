package com.gao.struct;

public class ContinueDemo {
    public static void main(String[] args) {
        int i =0;
        while (i<100){
            i++;
            if (i%10 ==0){
                System.out.println();
                continue; // 符合要求终止循环,重新开始循环
            }

            System.out.println(i);
        }
    }

}
