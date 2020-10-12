package com.gao.struct;

public class ForDemo02 {

    public static void main(String[] args) {
//        联系计算0到100的奇数和偶数
        int oddSum = 0;
        int evenSum =0;

        for (int i = 0; i <=100; i++) {
            if (i%2 !=0){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }
        System.out.println("奇数的和"+oddSum);
        System.out.println("偶数的和"+evenSum);
    }


}
