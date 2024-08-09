package com.itheima.demo05_switch;
import java.util.Scanner;
/*
        90~100 山地自行车一辆
        80~89 游乐场玩一次
        70~79 变形金刚玩具一个
        70以下 胖揍一顿

 */
public class SwithDemo03 {
    public static void main(String[] args) {
        System.out.println("请输入小明的考试成绩:");
        Scanner sc = new Scanner(System.in);
        int score =sc.nextInt();
        if (score>100||score<0){
            System.out.println("成绩输入无效！");
        }else {
            switch (score/10) {
                case 10:
                case 9:
                    System.out.println("山地自行车一辆");
                    break;
                case 8:
                    System.out.println("游乐场玩一次");
                    break;
                case 7:
                    System.out.println("变形金刚玩具一个");
                    break;
                default:
                    System.out.println("胖揍一顿");
                    break;
        }
        }
    }
}
