package com.itheima.demo06_lianxi;

import java.util.Scanner;

public class LianxiDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num = sc.nextInt();
        if (num<=999||num>9999) {
            System.out.println("您输入的数字无效，请重新输入:");
            num = sc.nextInt();
        }
        int a1 = num/1%10;
        int a2 = num/10%10;
        int a3 = num/100%10;
        int a4 = num/1000%10;
        System.out.println("您输入的会员卡号" + num +"各位之和：" +(a1 + a2 + a3 + a4));
        if(a1+a2+a3+a4 >=20){
            System.out.println("恭喜您是幸运用户");
        }else
            System.out.println("抱歉，您不是幸运用户");
    }
}
