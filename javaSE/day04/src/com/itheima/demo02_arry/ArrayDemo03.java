package com.itheima.demo02_arry;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arr2 = {5,15,1000,2000,100,400,10000};
        int max = arr2[0];
        for (int i=0;i<arr2.length;i++){
            if (arr2[i]>max)
                max = arr2[i];
        }
        System.out.println("数组最大的元素是：" +max);
    }
}
