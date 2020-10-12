package com.gao.method;

public class Demo04 {
    //不定项参数 ,可变参数
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,3,4,5);

    }
    //int...必须在后面例如 (int x,int... i)
    public void test(int x,int... i){
        System.out.println(i[0]);
    }

}
