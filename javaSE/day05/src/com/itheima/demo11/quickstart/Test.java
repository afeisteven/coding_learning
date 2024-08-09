package com.itheima.demo11.quickstart;

public class Test {
    public static void main(String[] args) {
        Animal an = new Cat();//向上转型，类似于隐式类型转换
        an.eat();
        //解决多态中父类引用不能直接使用子类的特有方法，必须要向下转型,类似于强制类型转换
        Cat c = (Cat) an;
        c.catchMous();
    }
}
