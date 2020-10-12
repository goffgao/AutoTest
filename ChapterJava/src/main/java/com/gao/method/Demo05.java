package com.gao.method;

public class Demo05 {
    public static void main(String[] args) {
        Demo05 test = new Demo05();
        //递归不建议这样使用错误方法
        test.test();

    }
    //递归不建议这样使用错误方法
    public void test(){
        test();
    }

}
