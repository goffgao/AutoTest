package com.gao.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //case穿透 //switch 匹配一个具体的值
        char grade= 'C';


        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("2");
                break;
            case 'C':
                System.out.println("3");
                break;
            case 'D':
                System.out.println("4");
                break;

        }

    }
}
