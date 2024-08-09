package com.itheima.demo01_quickstart;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        System.out.println("数组的地址为：" +arr1);
        arr1[0] = 11;
        int a = arr1[0];
        System.out.println(a);
        System.out.println("数组的长度为：" +arr1.length);
    }
}
