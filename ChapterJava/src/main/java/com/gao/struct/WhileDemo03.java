package com.gao.struct;

public class WhileDemo03 {
    //计算1+2+3+4+...+100
    public static void main(String[] args) {
        int i = 0;
        int sun = 0;

        while (i<=100){

            sun = sun +i;
            i++;

        }
        System.out.println(sun);
    }
}
