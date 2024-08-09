package com.itheima.demo08_student;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private int age;

    public Student(){ }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void study(){
        System.out.println(this.name +": 键盘敲烂，月薪过万！");
    }
    public void sleep(){
        System.out.println(this.name + ": 好好睡觉");
    }
    public void eat(){
        System.out.println(this.name + ": 好好吃饭");
    }
}
