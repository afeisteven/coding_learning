package com.itheima.demo02_arry;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arr1 = {11, 33, 22, 55, 44};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("数组第" + i + "个值是：" + arr1[i]);
        }
        System.out.println("---------------");
        for (int i = 0,temp; i <arr1.length/2; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
            System.out.println("数组第" + i + "个值是：" + arr1[i]);
        }
        System.out.println("---------------");
        for (int i=0;i<arr1.length;i++){
            System.out.println("数组第" + i + "个值是：" + arr1[i]);
        }
    }
}
