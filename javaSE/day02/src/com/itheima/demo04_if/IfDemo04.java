package com.itheima.demo04_if;

import java.util.Scanner;

public class IfDemo04 {
    public static void main(String[] args) {
        System.out.println("请输入1-7的数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1){
            System.out.println("星期一");
        }else if(num == 2){
            System.out.println("星期二");
        }else if (num == 3){
            System.out.println("星期三");
        }else if (num == 4){
            System.out.println("星期四");
        }else if (num == 5){
            System.out.println("星期五");
        }else if (num == 6){
            System.out.println("星期六");
        }else if (num == 0){
            System.out.println("星期天");
        }else {
            System.out.println("你不是地球人");
        }
    }
}
