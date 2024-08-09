package com.itheima.demo04_constructor;

public class Father {
    private String name;
    public Father() {
        System.out.println("Father类的 空参构造，用来初始化父类内容");
    }

    public Father(String name) {
        this.name = name;
        System.out.println("Father类的 带参构造，用来初始化父类内容" + name);
    }
}
