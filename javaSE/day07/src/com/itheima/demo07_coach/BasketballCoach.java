package com.itheima.demo07_coach;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教授：如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃：牛肉，喝牛奶");
    }
}
