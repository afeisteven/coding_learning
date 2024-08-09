package com.itheima.demo01_for;

public class ForDemo01 {
    public static void main(String[] args) {
       for (int i = 1; i<=10; i++) {
            System.out.println("李尚鸿是一个小可爱：" + i);
        }
        for (int i = 1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("---------------");
        for (int i = 5; i>=1; i--){
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i<=5; i++){
            sum += i;
        }
        System.out.println("-------------");
        System.out.println(sum);
    }
}
