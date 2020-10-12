package com.gao.variable;

/**
 * 一、先说类：
 * HelloWorld 类中有main()方法，说明这是个java应用程序，通过JVM直接启动运行的程序。
 * 既然是类，java允许类不加public关键字约束，当然类的定义只能限制为public或者无限制关键字（默认的）。
 *
 * 二、再说main()方法
 * 这个main()方法的声明为：public static void main(String args[])。必须这么定义，这是Java的规范。
 * 为什么要这么定义，和JVM的运行有关系。
 * 当一个类中有main()方法，执行命令“java 类名”则会启动虚拟机执行该类中的main方法。
 * 由于JVM在运行这个Java应用程序的时候，首先会调用main方法，调用时不实例化这个类的对象，而是通过类名直接调用因此需要是限制为public static。(类名.main())
 * 对于java中的main方法，jvm有限制，不能有返回值，因此返回值类型为void。
 * main方法中还有一个输入参数，类型为String[]，这个也是java的规范，main()方法中必须有一个入参，类型必须String[]，至于字符串数组的名字，这个是可以自己设定的，根据习惯，这个字符串数组的名字一般和sun java规范范例中mian参数名保持一致，取名为args。因此，main()方法定义必须是：“public static void main(String 字符串数组参数名[])”。
 *
 * 三、main()方法中可以throw Exception
 * 因此main()方法中可以抛出异常，main()方法上也可以声明抛出异常。
 * 比如，下面这个写法是正确的：
 */

//Constructor构造函数
public class ConstructorCase {
    private int m;    // 定义私有变量
    //属性（成员变量）

    //属性fields
    int id;
    String sname;
    int age;
    //方法
    void study(){
        System.out.println("我正在学习！");
    }
    //Java中的main()方法详解 程序执行的入口,必须要有
    public static void main(String[] args) {
        ConstructorCase constructorCase = new ConstructorCase(); // 创建一个对象
        constructorCase.id = 34;
        System.out.println(constructorCase.id);
        constructorCase.m=66;
        System.out.println(constructorCase.m);

    }

    // 定义无参的构造方法
    ConstructorCase() {
        id = 33;
    }
    // 定义有参的构造方法
    ConstructorCase(int m) {
        this.m = m;
    }


}

//类
class Computer{
    String brand;

}