package com.itheima.demo02_while;

public class WhileDemo02 {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.1;
        double zf_h = 8844430;
        while(paper < zf_h){
            paper *= 2;
            count++;
        }
        System.out.println("总共折叠"+count+"次数可超过珠穆朗玛峰的高度");
    }
}
