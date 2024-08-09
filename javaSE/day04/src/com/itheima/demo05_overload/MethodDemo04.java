package com.itheima.demo05_overload;

public class MethodDemo04 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i ==arr.length-1){
                System.out.println(arr[i]+ "]");
            }else {
                System.out.print(arr[i]+ ", ");
            }
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
        //    (i ==arr.length-1) ? System.out.println(arr[i]+ "]"):System.out.print(arr[i]+ ", ");
            System.out.print(arr[i] + (i ==arr.length-1? "]\r\n":", "));
    }
}
