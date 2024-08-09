package com.itheima.demo03_method;

import java.util.Scanner;

public class MethodDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意整数：");
        int abc = sc.nextInt();
        isEvenNumber(abc);
    }
    public static void isEvenNumber(int num){
        if (num%2==0)
            System.out.println(num+ "是偶数");
        else
            System.out.println(num+ "是奇数");
        return;
    }
}
