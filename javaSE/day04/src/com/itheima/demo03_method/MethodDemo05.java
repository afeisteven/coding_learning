package com.itheima.demo03_method;

public class MethodDemo05 {
    public static void main(String[] args) {
        int total = getSum(10,20);
        System.out.println("两数之和是：" +total);
    }
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
