package com.itheima.demo05_overload;

public class MethodDemo03 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("方法调用前：" +arr[1]);
        change(arr);
        System.out.println("方法调用后：" +arr[1]);
    }
    public static void change(int[] arr){
        arr[1] = 200;
    }
}
