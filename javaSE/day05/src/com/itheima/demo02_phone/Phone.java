package com.itheima.demo02_phone;

public class Phone {
    String brand;
    int price;
    String colour;

    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
    public void textmessage(String name){
        System.out.println("给" + name + "发短信");
    }
}
