package com.itheima.demo13_exercise;

//扩展: 多态在实际开发中的应用.
/*
    结论: 记忆
        实际开发中, 方法的形参一般写的都是父类型, 这样可以接收其任意的子类对象,
        然后通过 多态调用成员方法的规则: 编译看左, 运行看右, 就能调用指定子类对象的方法了.
        这也是多态在实际开发中最常用的场景.
 */
public class AnimalTest02 {
    public static void main(String[] args) {
        Cat c = new Cat();
        show(c);
        System.out.println("--------------");
        Dog d = new Dog();
        show(d);
    }
    //方法1：分解版
/*    public static void show(Cat c){
        c.eat();
    }    public static void show(Dog d){
        d.eat();
    }*/
    //方法2：多态版
    public static void show(Animal an){
        an.eat();
    }
}
