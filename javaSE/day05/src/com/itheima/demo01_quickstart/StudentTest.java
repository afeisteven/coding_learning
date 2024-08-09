package com.itheima.demo01_quickstart;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "李尚鸿";
        s1.age = 9;
        s1.sex = "男";
        System.out.println(s1.name);
        System.out.println("---------");
        s1.study();
        s1.eat();
        s1.sleep();
    }
}
