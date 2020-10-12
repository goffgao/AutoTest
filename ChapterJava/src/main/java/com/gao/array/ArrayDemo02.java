package com.gao.array;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.sql.SQLOutput;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化:创建 +赋值
        int[] a ={1,2,3};
        System.out.println(a[1]);

        //动态初始化 包含默认初始化
        int[] b = new int[10];
        b[0]=1;
        b[1]=2;
        System.out.println(b[0]);
        System.out.println(b[2]);
    }
}
