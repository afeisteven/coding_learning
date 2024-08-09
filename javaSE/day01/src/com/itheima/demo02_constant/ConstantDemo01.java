package com.itheima.demo02_constant;
/*
1.	整数常量.
 	例如: 1, 2, 3, 11, 22, 521
2.	小数常量.
 	例如: 5.21, 13.14
3.	字符常量.
 	解释: 字符的意思是说只能有一个值, 而且要用单引号括起来
 	例如: 'A', 'B', 'c', '10'(这样写会报错, 因为10是由1和0两个值组成的)
4.	字符串常量.
 	解释: 字符串常量值都要用双引号括起来
 	例如: "abc", "传智播客", "黑马程序员", "大数据"
5.	布尔常量
 	解释: 比较特殊, 值只有两个
•	true, 相当于正确
•	false, 相当于不正确
6.	空常量
 	解释: 比较特殊, 值只有一个: null, 表示什么都没有.
 	注意: 空常量不能通过输出语句直接打印.

 */
public class ConstantDemo01 {
    //定义main方法，程序主入口
    public static void main(String[] args) {

//1.	整数常量.
// 	例如: 1, 2, 3, 11, 22, 521
        System.out.println(10);
        System.out.println(20);
        System.out.println("------------");
//2.	小数常量.
// 	例如: 5.21, 13.14
        System.out.println(5.21);
        System.out.println(13.14);
        System.out.println("------------");
//3.	字符常量.
// 	解释: 字符的意思是说只能有一个值, 而且要用单引号括起来
// 	例如: 'A', 'B', 'c', '10'(这样写会报错, 因为10是由1和0两个值组成的)
        System.out.println('A');
        System.out.println('B');
        System.out.println('1');
        System.out.println("------------");
//4.	字符串常量.
// 	解释: 字符串常量值都要用双引号括起来
// 	例如: "abc", "传智播客", "黑马程序员", "大数据"
        System.out.println("abc");
        System.out.println("传智播客");
        System.out.println("黑马程序员");
        System.out.println("");
        System.out.println("------------");
//5.	布尔常量
// 	解释: 比较特殊, 值只有两个
//•	true, 相当于正确
//•	false, 相当于不正确
        System.out.println(true);
        System.out.println(false);
        System.out.println("------------");
//6.	空常量
// 	解释: 比较特殊, 值只有一个: null, 表示什么都没有.
// 	注意: 空常量不能通过输出语句直接打印.
//        System.out.println(null);
    }
}
