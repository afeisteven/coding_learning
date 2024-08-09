package com.itheima.demo06_this;

public class Student {
    int x = 10;
    public void method(){
        int x = 20;
        System.out.println(x);
        System.out.println(this.x);
    }
}
