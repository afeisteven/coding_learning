package com.itheima.demo01_operator;

public class OperatorDemo04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a>b ?a:b;
        System.out.println("max=" +max);
        int min = a>b?b:a;
        System.out.println("min=" +min);
    }
}
