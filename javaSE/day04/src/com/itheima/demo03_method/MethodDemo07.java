package com.itheima.demo03_method;

import java.util.Scanner;

public class MethodDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("最大值是：" +getMax(a,b));
    }
    public static int getMax(int a, int b){
        return a>b?a:b;
    }
}
