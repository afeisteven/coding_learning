package com.itheima.demo05_teacher;

public class BasicTeacher extends Teacher{
    public BasicTeacher() {
    }

    public BasicTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("基础班老师教授：JavaSE");
    }
}
