package com.itheima.demo04_exercise;

public class ExerciseDemo01 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        printArray(arr);
    }

    /**
     * 方法调用：遍历数组
     * @param arr 形式参数
     */
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
