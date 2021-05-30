package com.array;

public class ArrayReverse交互大小数据 {
    public static void main(String[] args) {
//        System.out.println("=======交换变量");
//        int a = 10;
//        int b = 20;
//        int temp = a;
//        System.out.println("temp="+temp);
//        a = b;
//        System.out.println("a="+a);
//        b=temp;
//        System.out.println("b="+b);
//
//        int[] array = new int[3];  //声明 index多少个 3
//
//        System.out.println("最后的最大值============");
//        array[0] = 10;
//        array[1] = 20;
//        array[2] = 30;
//        int max =array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]>max){
//                max = array[i];
//            }
//        }
//        System.out.println("最大值="+max);
//
//        System.out.println("最后最小值============");
//        int min =array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]<min){
//                min = array[i];
//            }
//        }
//        System.out.println("最小="+min);


        //最后要测试点------------是循环互换大小值

     int[] array ={10,20,30,40,50};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("======================");

        /*
        * 初始化语句
        *
        * */

        for (int min = 0, max = array.length -1;  // 初始化;
             min<max; //布尔表达式;
             min++,max--) {//更新变量
            int temp = array[min];  //开始倒手
            array[min] = array[max];
            array[max]= temp;

        }


    }
}
