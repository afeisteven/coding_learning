package com.itheima.demo01_operator;

public class OperatorDemo03 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
/*        System.out.println((a++>2) & (b++<7));
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------");*/
        /*System.out.println((a++>2) && (b++<7));
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------");
        */
        System.out.println((a++>1) || (b++<7));
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------");
    }
}
