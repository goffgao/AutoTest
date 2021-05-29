package com.ifandelse;

public class IfTest {
    public static void main(String[] args) {
        System.out.println("执行语法if或者else中的内容==========");
        int x =1;
        if (x == 2){
            System.out.println("if语法体");
        }else{
            System.out.println("else语法体");
        }


        System.out.println("算法计算============");
        int a =13;
        if (a % 3 ==0){//如果除以2能够余数为0,说明是偶数
            System.out.println("偶数");}
        else {
            System.out.println("奇数");
        }

        System.out.println("使用if后++++++++else  if+++else if+++++++else");
        int b =30;
        int c;
        if (b>=3){
            c = b *3;
            System.out.println("条件1=="+c);
        }
        else if( b<=3){
            c = b/3;
            System.out.println("条件2=="+c);

        }
        else {
            System.out.println( "结束条件了"); }
    }
}
