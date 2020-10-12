package com.gao.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "狂神";
        //JDK7的新特性,表达式结果可以是字符串
        //字符串的本质还是数字

        //反编译 java---class(字节码文件) ---反编译(IDEA)
        switch (name){
            case "狂神":
                System.out.println("狂神");
                break;
            case "请将2":
                System.out.println("请将2");
                break;
            default:
                System.out.println("弄啥呀");
        }
    }


}
