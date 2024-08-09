package com.itheima.demo07_constructor;

public class Student {
    private String name;

    public Student(){
        System.out.println("我是Student的空参构造");
    }
    public Student(String name){
        this.name = name;
        System.out.println("我是Student的全参构造");
    }
}
