package com.itheima.demo03_method;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MethodDemo06 {
    public static void main(String[] args) {
        System.out.println("请输入任意整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = isEvenNumber(num);
        if (flag)
            System.out.println("这是一个偶数");
        else
        System.out.println("这是一个奇数");
    }
    public static boolean isEvenNumber(int a){
        //boolean flag = (a%2==0)?true:false;
        //boolean flag = (a % 2 ==0);
        return a % 2 ==0;
    }
}
