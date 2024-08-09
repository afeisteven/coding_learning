package com.itheima.demo04_if;

import java.util.Scanner;

public class IfDemo05 {
    public static void main(String[] args) {
        System.out.println("请输入小明考试分数：（0~100）");
        /*
        –	95~100 山地自行车一辆
        –	90~94 游乐场玩一次
        –	80~89 变形金刚玩具一个
        –	80以下 胖揍一顿
         */
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score>=95 && score<=100){
            System.out.println("山地自行车一辆");
        }else if(score>=90 && score<=94){
            System.out.println("游乐场玩一次");
        }else if (score>=80 && score<=89){
            System.out.println("形金刚玩具一个");
        }else if (score<80){
            System.out.println("胖揍一顿");
        }else{
            System.out.println("你肯定考试作弊了！");
        }
        //优化版
        if (score>100||score<0){
            System.out.println("输入的分数无效，请重新输入：");
        }else if (score>=95){
            System.out.println("山地自行车一辆");
        }else if(score>=90 ){
            System.out.println("游乐场玩一次");
        }else if (score>=80){
            System.out.println("形金刚玩具一个");
        }else {
            System.out.println("胖揍一顿");
        }
    }
}
