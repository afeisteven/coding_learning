package com.itheima.demo02_object;

public class StudentDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("liu",22);
        System.out.println(s1);
        System.out.println(s1.toString());
        Student s2 = new Student("liu",22);
//        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
