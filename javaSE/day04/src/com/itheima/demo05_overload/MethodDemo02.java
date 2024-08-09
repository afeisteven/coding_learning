package com.itheima.demo05_overload;

public class MethodDemo02 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("方法调用前：" +num);
        change(num);
        System.out.println("方法调用后：" +num);
    }
    public static void change(int num){
        num = 200;
        System.out.println("方法调用内部：" +num);
    }
}
