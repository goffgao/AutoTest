package com.oop;



public class Person {
    //一个类即使什么都不写,它也会存在一个方法
    //显示的定义构造器
    String  name;
    int age;


//alt + insert 会自动生成一个构造器


    //1.使用new关键字,本质是在调用构造器
    //2.用来初始化值
    public Person() {
    }

    //有参构造:一旦定义了有参构造,无参数必须显示定义

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //首次练习写法
    public Person(int age) {
        Person person = new Person();
        person.age = age;
        //this.age就是person.age,this.age不用new: Person person = new Person();直接下面写法可以省略上面两个步骤,不过建议不这样写this.age
        this.age =age;
        System.out.println();
    }


}
