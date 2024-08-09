package com.itheima.demo02_while;

public class WhileDemo01 {
    public static void main(String[] args) {
            int sum = 0;
            int i = 1;
            while (i<=100){
                if (i%2==0)
                    sum +=i;
                i++;
            }
        System.out.println("1~100内所有偶数和是：" +sum);
        System.out.println("-------------------");
        //简化版
        int sum1 = 0;
        int a1 = 2;
        while (a1<=100){
            sum1 += a1;
            a1 += 2;
        }
        System.out.println("1~100内所有偶数和是：" +sum1);
    }
}
