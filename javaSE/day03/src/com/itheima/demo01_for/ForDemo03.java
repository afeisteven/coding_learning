package com.itheima.demo01_for;

public class ForDemo03 {
    public static void main(String[] args) {
        int ge,shi,bai,sum,count=0;
        for (int i = 100; i<1000; i++){
            ge = i/1%10;
            shi = i/10%10;
            bai = i/100%10;
            sum = (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai);
            if (sum == i){
                System.out.println("该数"+i+"是水仙花数");
                count++;
            }
        }
        System.out.println("共有"+count+"个水仙花数");
    }
}
