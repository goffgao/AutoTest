package com;

public class breakandcontinue {

    public static void main(String args[]) {

        // break用法 中断执行
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }


//continue 跳过继续执行

        int [] numbers2 = {10, 20, 30, 40, 50};

        for(int x2 : numbers2 ) {
            if( x2 == 30 ) {
                continue;
            }
            System.out.print( x2 );
            System.out.print("\n");
        }
    }
}
