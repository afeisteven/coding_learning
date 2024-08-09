package com.itheima.demo02_scanner;
import java.util.Scanner;

public class ScannerDemo03 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean bl = (num<100) && (num>999);
        int hundred = num/100;
        //int shi = (num-hundred*100)/10;
        int shi = num/10%10;
        //int ge = (num-hundred*100-shi*10);
        int ge = num%10;
        System.out.println("您输入的三位数百位数是：" +hundred);
        System.out.println("您输入的三位数十位数是：" +shi);
        System.out.println("您输入的三位数个位数是：" +ge);
    }
}
