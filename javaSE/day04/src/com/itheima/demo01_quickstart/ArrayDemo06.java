package com.itheima.demo01_quickstart;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        int[] arr2 = arr1;
        arr2[1] = 200;
        System.out.println(arr2);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr2[1]);
    }
}
