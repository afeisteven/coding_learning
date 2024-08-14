package com.itheima.demo03_animal;
//案例: 演示抽象类的特点.
/*
    1. 抽象类和抽象方法都用abstract关键字修饰.
    2. 抽象类中不一定有抽象方法, 但是有抽象方法的类一定是抽象类.
    3. 抽象类不能实例化.
        那么抽象类如何实例化呢?
        答: 可以通过创建其子类对象的形式, 来完成抽象类的初始化.
    4. 抽象类的子类:
        如果是普通类, 则必须重写父类的所有的抽象方法.
        如果是抽象类, 则可以不用重写父类的所有抽象方法.
 */
public class AnimalTest {
    public static void main(String[] args) {
        //1. 演示: 抽象类不能实例化.
        //Animal an = new Animal();   这样写会报错.
        //2. 抽象类可以通过创建其子类对象的形式, 来完成抽象类的初始化.
        //抽象类多态
        Animal a1 = new Cat();
    }
}
