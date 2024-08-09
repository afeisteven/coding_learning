package com.itheima.demo04_exercise;

import java.util.Scanner;

public class ExerciseDemo03 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("请输入+-*/任意运算符：");
        String str = sc.next();
        double result = getCal(str,a,b);
        System.out.println(a+ str +b +"的结果是：" +result);
    }

    public static double getCal(String str, int a, int b) {
        double result = 0;
        switch (str) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = (double)a / b;
                break;
            default:
                break;
        }
        return result;
    }
}
