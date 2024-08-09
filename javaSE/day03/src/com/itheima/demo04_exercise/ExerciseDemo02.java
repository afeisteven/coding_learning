package com.itheima.demo04_exercise;

public class ExerciseDemo02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, -22, 55, 100, 7, 999};
        int max = getMax(arr);
        System.out.println("数组最大值是：" + max);
    }

    /**
     * 方法功能：返回数组最大值
     * @param arr 数组形参
     * @return 返回最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
