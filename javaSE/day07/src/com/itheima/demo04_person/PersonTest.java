package com.itheima.demo04_person;
//案例: 用来演示抽象类的成员特点.
/*
    结论: 记忆
        抽象类中可以有变量, 常量, 构造方法, 抽象方法和非抽象方法.

        问题一:
            思考:  既然抽象类不能实例化, 那要构造方法有什么用?
            答:    用于子类对象访问父类数据前, 对父类数据进行初始化.

        问题二: 抽象类中的抽象方法和非抽象方法的作用是什么?
            抽象方法: 强制要求子类必须完成某些事情.
            非抽象方法: 让子类继承, 提高代码的复用性.

    小技巧:
        final 一般要结合 static, public, 或者private 一起使用.
 */
public class PersonTest {
    public static void main(String[] args) {
//        Person p = new Person();
        Person p = new Student();
        System.out.println(p.age);
        System.out.println(p.country);
        System.out.println(Person.country);

        p.show();
        p.eat();
    }
}
