package com.oop.demo02;

import sun.applet.Main;

import javax.sound.midi.Soundbank;

//一个项目应该只存在一个main方法
public class Application {

    public static void main(String[] args) {
    Student sd = new Student();
    sd.name = "gf";
    sd.study();
    sd.eat();
    sd.say();

    Person ps = new Student();
    ps.study();
    ps.say();

    Person p2 = new Person();
    p2.study();
    p2.say();
    }


}

