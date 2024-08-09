package com.itheima.demo04_break_continue;

public class ContinueDemo02 {
    public static void main(String[] args) {
        int i=1;
        for(; i<=10; i++){
            if (i%3 == 0)
                continue;
            System.out.println(i);
        }
    }
}
