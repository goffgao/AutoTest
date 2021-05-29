package com.forandwhile;

public class WhileTest {
    public static void main(String args[]) {
        /*
while是最基本的循环，它的结构为：只要布尔表达式为 true，循环就会一直执行下去。

while( 布尔表达式 ) {
  //循环内容
}

*/
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }



/*    对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。

            do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

            do {
        //代码语句
    }while(布尔表达式);
    注意：布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。 如果布尔表达式的值为 true，则语句块一直执行，直到布尔表达式的值为 false。
    */


        int y = 10;
        do{
            System.out.print("value of y : " + y );
            y++;
            System.out.print("\n");
        }while( y < 20 );
    }

}
