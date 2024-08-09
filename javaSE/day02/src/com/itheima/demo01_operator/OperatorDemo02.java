package com.itheima.demo01_operator;

public class OperatorDemo02 {
    public static void main(String[] args) {
        System.out.println(true & true);//ture
        System.out.println(true & false);//false
        System.out.println(false & true);//false
        System.out.println(false & false);//false
        System.out.println("----------");
        System.out.println(true | true);//ture
        System.out.println(true | false);//ture
        System.out.println(false | true);//ture
        System.out.println(false | false);//false
        System.out.println("----------");
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false
        System.out.println("----------");


    }
}
