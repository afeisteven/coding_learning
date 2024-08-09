package com.itheima.demo05_student;
public class Student {
    private String name;
    private int age;

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
        System.out.println("键盘敲烂，月薪过万");
    }
    public void sleep(){
        System.out.println("睡觉是身体的本钱");
    }
}
