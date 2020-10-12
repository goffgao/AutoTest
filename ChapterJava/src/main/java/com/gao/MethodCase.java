package com.gao;

public class MethodCase {
    public static void main(String[] args) {
        farmer();//农民方法
        seller();// 商贩方法
        cook();// 调用厨子方法
        me();//我
    }
    public static void me(){
        // 我
        System.out.println("吃");
    }
    public static void cook(){
        // 厨子
        System.out.println("洗菜");
        System.out.println("装盘");
    }
    public static void  seller(){
        // 小商贩
        System.out.println("运输到农贸市场");
        System.out.println("卖给厨子");

    }
    public static void  farmer(){
        // 农民伯伯
        System.out.println("播种");
        System.out.println("浇水");
    }


}
