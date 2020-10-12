package com.gao.array;

import org.omg.PortableServer.ForwardRequest;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //了解二维数组就好
        //[4][2]  以后要学习面向对象

        int[][] arrays = {{1, 2}, {2,3}, {3,4},{4,5}};
        for (int i =0;i<arrays.length;i++){
            for (int j =0; j<arrays[i].length;j++){
                System.out.println(arrays[i][j]);
            }
        }
    }
}






