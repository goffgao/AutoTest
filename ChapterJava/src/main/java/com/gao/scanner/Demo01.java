package com.gao.scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用Next方法接收,遇到有空格的String类型只会打印前面的例如:H W只答应H");
        String str = scanner.next();
        System.out.println(str);
        scanner.close();//需要关闭线程不然占用

    }
}
