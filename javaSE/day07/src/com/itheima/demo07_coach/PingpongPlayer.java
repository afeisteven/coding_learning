package com.itheima.demo07_coach;

public class PingpongPlayer extends Player implements SpeakEnglish{
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员：如何发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃：鱼，喝麦片");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员要会说英语");
    }
}
