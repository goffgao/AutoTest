package com.gao.struct;

public class LabelDemo {

    public static void main(String[] args) {
        //打印101-150
        //质数 在大于1的自然数中,除了1和它本身以外不再有其他因素的自然数;

        int  count=0;

        //goto在java中没有 可以使用标签outer使用 ,了解就好不深究 不建议使用
        outer:for (int i = 101;i<150;i++){
            for (int j =2;j<i/2;j++){
                if (i % j ==0){
                    continue outer;
                }
            }
            System.out.println(i+"");

        }


    }
}
