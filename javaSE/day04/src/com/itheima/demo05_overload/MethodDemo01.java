package com.itheima.demo05_overload;

public class MethodDemo01 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        System.out.println(compare(b1,b2));
    }
    public static boolean compare(byte b1, byte b2){
        System.out.println("byte");
        return b1==b2;
    }
    public static boolean compare(short b1, short b2){
        System.out.println("short");
        return b1==b2;
    }
    public static boolean compare(int b1, int b2){
        System.out.println("int");
        return b1==b2;
    }
    public static boolean compare(long b1, long b2){
        System.out.println("long");
        return b1==b2;
    }
}
