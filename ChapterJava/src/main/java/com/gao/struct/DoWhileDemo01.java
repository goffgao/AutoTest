package com.gao.struct;

public class DoWhileDemo01 {

        public static void main(String[] args) {
            int i = 0;
            int sun = 0;
            //do While总是保证循环会被至少执行一次
            //while判断后执行

            do{
                sun = sun +i;
                i++;
            }
            while (i<=100);
            System.out.println(sun);
        }
    }
