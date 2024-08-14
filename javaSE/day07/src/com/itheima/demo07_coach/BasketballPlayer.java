package com.itheima.demo07_coach;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员教授：如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃：羊肉，喝羊奶");
    }

}
