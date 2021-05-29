package com.forandwhile;



public class ForTest {
    public static void main(String args[]) {
/*
for(初始化; 布尔表达式; 更新变量) {
    //代码语句
}
*/
        for(int x = 10; x < 20; x = x+1) {
            System.out.print("for用法value of x : " + x );
            System.out.print("\n");
        }




/*
Java 增强 for 循环语法格式如下:

for(声明语句 : 表达式)
{
   //代码句子
}
声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等。

表达式：表达式是要访问的数组名，或者是返回值为数组的方法。

实例
*/

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }





    }
}
