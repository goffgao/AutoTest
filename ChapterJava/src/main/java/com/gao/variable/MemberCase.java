package com.gao.variable;

public class MemberCase {
    //成员变量 Member 自动被初始化

    int a; //动态  成员变量,从属于对象;成员变量会自动被初始化.

    static int size;//静态成员变量,从属于类

    private int age;

    public void shopping(){
        System.out.println(this.age);
    }

    public static void main(String[] args) { //对象

        //fields属性需要new创建对象
        MemberCase memberCase = new MemberCase(); //new创建对象
        System.out.println(memberCase.a); //成员变量自动被初始化
        memberCase.a=15;
        System.out.println(memberCase.a);
        System.out.println();


        System.out.println("===============");

        //不用new
        System.out.println(size); //成员变量自动被初始化
        size = 77; //静态变量不需要new实例化
        System.out.println(size);

        System.out.println("===============");

        //private属性需要new创建对象
        System.out.println(memberCase.age); //成员变量自动被初始化
    }



}
