package com.itheima.demo10_exercise;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("学生喝汤");
    }
    public void study(){
        System.out.println("键盘敲烂，月薪过万");
    }
}
