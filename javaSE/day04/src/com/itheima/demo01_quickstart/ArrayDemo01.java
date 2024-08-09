package com.itheima.demo01_quickstart;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //动态数组推荐写法
        int [] arr1 = new int[3];
        for (int i=0;i<=2;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("-------------");
        for (int i=0;i<=2;i++){
            arr1[i] = i;
            System.out.println(arr1[i]);
        }
        System.out.println("----------");
        //语法糖，简化推荐写法
        int [] arr2 = {11,22,33};
        for (int i=0;i<=2;i++){
            System.out.println(arr2[i]);
        }
    }
}
