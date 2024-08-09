package com.itheima.demo10_exercise;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("老师吃肉");
    }
    public void teach(){
        System.out.println("老师要讲课");
    }
}
