package com.gao.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,888,999,444,111,34};

//        System.out.println(a);
//        System.out.println(Arrays.toString(a));
//        printArray(a);

        Arrays.sort(a); //数组进行排序 ,升序
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,0); //数组填充
        System.out.println(Arrays.toString(a));
//        Arrays.fill(a,2,4,0); //数组填充
//        System.out.println(Arrays.toString(a));







    }
    
    //自己也可以写Arrays.toString()方法但是不建议自己也造轮子,使用别人的就好,但是要了解





    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i==0){
                System.out.print("[");
            }
            if (i==a.length-1){
                System.out.println(a[i]+"]");
            }else {
                System.out.print(a[i]+", ");
            }

        }
    }
    
    
    
}






