package com.itheima.demo02_scanner;
import java.util.Scanner;
public class ScannerDemo01 {
    public static void main(String[] args) {
        System.out.println("请输入您的年龄：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("您的年龄是：" +age);
    }

}
