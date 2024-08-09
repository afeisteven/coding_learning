package com.itheima.demo04_if;

import java.util.Scanner;

public class IfDemo06 {
    public static void main(String[] args) {
        System.out.println("请输入三个整数：");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = n1;

        if(n1>n2) {
        //n1大，n1和n3比较
            if (n1>n3) {
                max = n1;
            }else {
                max = n3;
            }
        }else {
        //n2大，n2和n3比较
            if (n2>n3) {
                max = n2;
            }else {
                max = n3;
            }
        }
        System.out.println("最大整数是：" +max);
        //简单暴力版，讲师的算法有问题！
        int max2 = n1;
        if (n1>=n2 && n1>=n3) {
            max2 = n1;
        } else if (n2>=n1 && n2>=n3) {
            max2 = n2;
        }else {
            max2 = n3;
        }
        System.out.println("最大整数是：" +max2);
        System.out.println("-----------------");
        //三元版
        int max3 = ((n1>=n2)?((n1>=n3)?n1:n3):((n2>=n3?n2:n3)));
        System.out.println("最大整数是：" +max2);
    }
}
