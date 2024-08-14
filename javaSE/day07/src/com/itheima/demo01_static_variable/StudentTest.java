package com.itheima.demo01_static_variable;

public class StudentTest {
    public static void main(String[] args) {
        Student.graduateFrom = "中山大学";
        Student s1 = new Student();
        s1.name = "刘亦菲";
        s1.age = 33;
//        s1.graduateFrom = "吉首大学";

        Student s2 = new Student();
        s2.name = "杨幂";
        s2.age = 31;
//        s2.graduateFrom = "吉首大学";
        s1.show();
        s2.show();
    }
}
