package com.itheima.demo13_exercise;

//扩展: instanceof 关键字.
/*
   instanceof 关键字
       格式:
            引用(对象)   instanceof   数据类型
       作用:
            用来判断前边的引用(或者是对象) 是否是 后边的数据类型.
        例如:
            Cat c = new Cat();

            c instanceof Cat        ->  true
            c instanceof Dog        ->  false
 */
public class AnimalTest03 {
    public static void main(String[] args) {
        Cat c = new Cat();
        show(c);
        System.out.println("--------------");
        Dog d = new Dog();
        show(d);
    }
    //方法2：多态版
    public static void show(Animal an){
        an.eat();
        if(an instanceof Cat){
            Cat c = (Cat) an;
            c.catchMouse();
        }else if (an instanceof Dog){
            Dog d = (Dog) an;
            d.lookHome();
        }
    }
}
