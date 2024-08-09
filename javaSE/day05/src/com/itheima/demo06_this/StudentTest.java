package com.itheima.demo06_this;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.method();
        Student s2 = new Student();
        System.out.println("------");
        s2.x = 100;
        s2.method();
    }
}
