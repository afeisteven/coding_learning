package com.itheima.demo02_static_method;
//案例: 学生类的测试类, 用来演示静态方法的注意事项的.
/*
    访问特点:
         静态方法只能访问静态的成员变量和静态的成员方法.
         简单记忆: 静态只能访问静态.
    注意事项:
        1.在静态方法中, 是没有this, super关键字的.
        2.因为静态的内容是随着类的加载而加载, 而this和super是随着对象的创建而存在.
         即: 先进内存的, 不能访问后进内存的.
 */
public class Student {
    String name = "刘亦菲";
    static int age = 33;

    public void show1(){
        System.out.println(name);
        System.out.println(age);
        show3();
        show4();
        System.out.println("非静态方法 1");
    }
    public void show2(){
        System.out.println("非静态方法 2");
    }
    public static void show3(){
        System.out.println("静态方法 3");
    }
    public static void show4(){
        System.out.println("静态方法 4");
    }
}
