package com.itheima.demo01_static_variable;

public class Student {
    String name;
    int age;
    static String graduateFrom;

    public void show() {
        System.out.println(name + "..." + age + "..." + graduateFrom);
    }
}
