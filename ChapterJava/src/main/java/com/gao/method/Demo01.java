package com.gao.method;

//method方法

public class Demo01 {
    //main方法
    public static void main(String[] args) {

        //实际参数:实际调用的传递给他的参数
        int sum = add(1,2);
        System.out.println(sum);
//        test();
    }

    //加法
    //形式参数,用来定义作用的
    public static int add(int a,int b){
        return a+b;
    }

    public static void test(){
        for (int i =0; i<=1000; i++){
            if (i%5==0){
                System.out.print(i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println();
//                System.out.print();
            }
        }
    }

}
