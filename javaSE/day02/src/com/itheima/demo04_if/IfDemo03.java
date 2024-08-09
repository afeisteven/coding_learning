package com.itheima.demo04_if;

import java.util.Scanner;
public class IfDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println(num+ "是一个偶数");
        } else {
            System.out.println(num +"是一个奇数");
        }
        System.out.println("---------------");
        System.out.println(num%2==0? num+ "是一个偶数":num+ "是一个奇数");
    }

}
