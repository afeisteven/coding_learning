package com.itheima.demo08_student;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("limingfei");
        s.setAge(46);
        s.eat();
        s.sleep();
        s.study();
        System.out.println("----------------");
        Student s1 = new Student("运杰",17);
        s1.eat();
        s1.sleep();
        s1.study();
    }
}
