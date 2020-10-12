package com.gao;

public class IfElseifElse {
    public static void main(String[] args) {
        int x =-10;
        int y;
        if (x >=3){
            y = 2 * x + 1;
        } else if (-1<x && x<3){ // else if(){}可以使用N次
            y = 2*x;

        }else {
            y = 2 * x-1;
        }
        System.out.println("结果是:" + y);

    }
}
