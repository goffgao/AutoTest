package com.oop;

import com.oop.demo04.Student;
//一个项目应该只存在一个main方法
public class Application {



    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setAge(-1);//不合法
        System.out.println(s1.getAge());


    }
}
