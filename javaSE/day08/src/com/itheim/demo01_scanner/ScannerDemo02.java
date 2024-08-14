package com.itheim.demo01_scanner;

import java.util.Scanner;

/*
解决字符串next和nextline的连续调用问题，以下两种方法都不好
实际开发中统统采用nextline()调用字符串，再将字符串转型为整数，详见demo02
*/
public class ScannerDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String str1 = sc.nextLine();
        int i = Integer.parseInt(str1);
        System.out.println(i + 3);
        System.out.println("请输入字符串：");
/*
方案1：
        Scanner sc1 = new Scanner(System.in);
        String str2 = sc1.nextLine();
*/
/*
方法2：
        sc.nextLine();
        str1 = sc.nextLine();
*/
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
