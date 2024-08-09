package com.itheima.demo04_if;

public class IfDemo02 {
    public static void main(String[] args) {
        System.out.println("begin");
        int time = 5;
        if (time>=0 && time<=8) {
            System.out.println("早上好！");
        }else{
            System.out.println("中午好！");
        }
        System.out.println("---------------");
        System.out.println(time>=0 && time<=8 ? "上午好":"中午好");
            System.out.println("end");
    }
}
