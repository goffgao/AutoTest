package com.gao.scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //和
        double sum =0;
        //计算输入了多少个数字
        int m = 0;
        //通过循环判断是否还有输入,并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            System.out.println("你输入了第"+x);

            m = m+1; //m++
            sum = sum+x;
        }

        System.out.println(m + "个数的和为"+sum);
        System.out.println(m + "个数的平均值是" +(sum/m));


        scanner.close();
    }
}
