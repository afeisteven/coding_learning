package com.itheima.demo02_scanner;
import java.util.Scanner;
public class ScannerDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚身高：");
        int h1 = sc.nextInt();
        System.out.println("请输入第二个和尚身高：");
        int h2 = sc.nextInt();
        System.out.println("请输入第三个和尚身高：");
        int h3 = sc.nextInt();
        int max_h =(h1>h2)?(h1>h3?h1:h3):(h2>h3?h2:h3);
        System.out.println("最高和尚的身高是：" +max_h);
    }
}
