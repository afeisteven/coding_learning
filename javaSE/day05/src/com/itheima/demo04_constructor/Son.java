package com.itheima.demo04_constructor;

public class Son extends Father{
    public Son() {
        super();//子类空参访问父类空参
        System.out.println("Son类的 空参构造，用来初始化子类内容");
    }

    public Son(String name) {
        super(name);//子类带参访问父类带参
        System.out.println("Son类的 带参构造，用来初始化子类内容" + name);
    }
}
