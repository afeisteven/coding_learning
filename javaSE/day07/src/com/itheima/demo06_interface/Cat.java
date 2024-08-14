package com.itheima.demo06_interface;

public class Cat implements Jumpping{
    public void catMouse (){
        System.out.println("猫会抓老鼠");
    }

    @Override
    public void jump() {
        System.out.println("猫会跳高！");
    }
}
