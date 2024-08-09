package com.itheima.demo06_math;

public class MathDemo01 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            double a = Math.random();
//            System.out.println(a);
            int b = (int)(a*100+1);
            System.out.println(b);
        }
        System.out.println("------------");
        for (int i=1;i<=5;i++){
            double c = Math.random();
            int num =(int)(c*10+1);
            System.out.println(num);
        }
    }
}
