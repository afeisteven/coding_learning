package com.itheima.demo04_person;

public abstract class Person {
    int age;
    static final String country = "中国";

    public Person() {
    }
    public Person(int age) {
        this.age = age;
    }
    public void show() {
        System.out.println("非抽象方法shou()");
    }
    //抽象方法，必须要在抽象类中
    public abstract void eat();
}
