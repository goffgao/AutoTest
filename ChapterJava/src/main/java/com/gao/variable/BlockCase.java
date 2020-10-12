package com.gao.variable;

public class BlockCase {
    public static void main(String[] args) {
        {
            int age; //局部变量从属于语句块
        }
//        age =18; //无法调用语句块中的变量
//        System.out.println(age);

        int salary = 3000;  //局部变量从属于方法,  public static void main中的方法变量
        System.out.println(salary);
    }

}

