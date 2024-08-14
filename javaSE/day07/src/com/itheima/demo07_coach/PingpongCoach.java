package com.itheima.demo07_coach;

public class PingpongCoach extends Coach implements SpeakEnglish {
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教：如何发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃：大白菜，喝粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练要会说英语");
    }
}
