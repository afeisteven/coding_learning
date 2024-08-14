package com.itheima.demo13_exercise;

public class AnimaTest {
    public static void main(String[] args) {
        Animal an1 = new Dog();
        an1.setName("牧羊犬");
        an1.setAge(13);
        System.out.println(an1.getName() + "..." + an1.getAge());
        an1.eat();
        //父类不能直接使用子类的特有方法，需要向下转型。
        Dog d1 = (Dog)an1;
        d1.lookHome();
        System.out.println("--------------------------");
        Animal an2 = new Dog("拉布拉多犬",9);
        System.out.println(an2.getName() + "..." + an2.getAge());
        an2.eat();
        Dog d2 = (Dog)an2;
        d2.lookHome();
    }
}
