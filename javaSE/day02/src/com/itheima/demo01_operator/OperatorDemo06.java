package com.itheima.demo01_operator;

public class OperatorDemo06 {
    public static void main(String[] args) {
        //获取和尚的最高身高
        int h1 = 150;
        int h2 = 200;
        int h3 = 165;
        int temp_h = h1>h2?h1:h2;
        int max_h = h3>temp_h?h3:temp_h;
        System.out.println("The max height is:" +max_h);
        System.out.println("采用三元嵌套式写法");
        int max_height = ((h1>h2?h1:h2)>h3)?(h1>h2?h1:h2):h3;
        System.out.println("最高和尚身高：" + max_height);
        System.out.println("------------");
        int max_height2 = (h1>h2)?(h1>h3?h1:h3):(h2>h3?h2:h3);
        System.out.println("三元嵌套最佳写法：" +max_height2);
    }
}
