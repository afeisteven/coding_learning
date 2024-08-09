package com.itheima.demo05_student;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(111);
        s.setName("limingfei");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.study();
        s.sleep();
    }
}
