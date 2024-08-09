package com.itheima.demo06_debug;
/*
1.	加断点. 哪里不会点哪里.
 	即: 选择要设置断点的代码行，在行号的区域后面单击鼠标左键即可
2.	运行加了断点的程序, 就可以开始进行Debug调试了.
 	即:在代码区域右键, 然后选择Debug开始执行.
3.	开始调试时, 看哪里呢?
–	Debugger窗口: 看代码执行到了哪里.
–	Console窗口: 看程序执行过程中的结果展示(就是控制台).
–	Variables窗口: 看代码执行过程中, 变量的变化.
4.	如何进行下一步呢?
–	F7: 逐过程调试.
–	F8: 逐行调试.
–	F9: 逐断点调试.
5.	如何删除断点?
–	选择要删除的断点，单击鼠标左键即可
–	如果是多个断点，可以每一个再点击一次。也可以一次性全部删除.
 */

public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = getSum(a, b);
        System.out.println("1111");
        System.out.println("sum: " + sum);
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
