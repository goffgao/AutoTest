package com.gao.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //从奖品接受数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收:");
        String srt =scanner.nextLine();
        System.out.println("输出的内容为:"+srt);
        scanner.close();
    }
}
