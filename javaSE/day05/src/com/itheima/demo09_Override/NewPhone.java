package com.itheima.demo09_Override;

public class NewPhone extends Phone{
    @Override
    public void call(String name){
        super.call(name);
        System.out.println("播放彩铃");
    }
}
