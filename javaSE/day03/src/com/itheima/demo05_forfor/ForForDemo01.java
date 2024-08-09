package com.itheima.demo05_forfor;

public class ForForDemo01 {
    public static void main(String[] args) {
        for (int i = 2020; i <= 2023; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i + "年" + j + "月\t");
            }
            System.out.print("\n");
        }
    }
}
