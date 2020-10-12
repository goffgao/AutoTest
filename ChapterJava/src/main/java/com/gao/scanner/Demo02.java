package com.gao.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //从奖品接受数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收:");

        //判断是否还有输入
        if (scanner.hasNextLine()){
            String srt =scanner.nextLine();
            System.out.println("输出的内容为:"+srt);
        }
        //凡是属于IO的类如果不关闭会一直占用线程
        scanner.close();
    }
}
