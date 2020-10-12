package com.oop.demo02;

//学生
public class Student extends Person{
    //属性:字段
    String name;
    int age;

    //方法
    public void study(){
        System.out.println(this.name+"学生在学习");
    }
    public void eat(){
        System.out.println(this.name+"eat");
    }
}
