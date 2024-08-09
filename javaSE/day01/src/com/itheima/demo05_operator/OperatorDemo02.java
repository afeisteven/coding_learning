package com.itheima.demo05_operator;

public class OperatorDemo02 {
    public static void main(String[] args) {
        int a = 10;
        //a++;
        //++a;
        //++或--隐含强制类型转化
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
