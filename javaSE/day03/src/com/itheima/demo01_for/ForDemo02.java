package com.itheima.demo01_for;

public class ForDemo02 {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int d = 1; d<=100; d++){
            if (d%2==0)
                sum1 += d;
        }
        System.out.println(sum1);
        System.out.println("-------------");
        //简化版
        int sum2 = 0;
        for (int i = 2; i<=100; i+=2)
            sum2 +=i;
        System.out.println("sum2:" +sum2);
    }
}
