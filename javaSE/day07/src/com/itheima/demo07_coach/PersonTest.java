package com.itheima.demo07_coach;

public class PersonTest {
    public static void main(String[] args) {
        //1、测试乒乓球运动员
        PingpongPlayer pp = new PingpongPlayer("马龙", 31);
        System.out.println(pp.getName() + "..." + pp.getAge());
        pp.eat();
        pp.study();
        pp.speak();
        System.out.println("---------------------");
        //2、测试乒乓球教练
        PingpongCoach pc = new PingpongCoach("刘国梁", 44);
        pc.eat();
        pc.teach();
        pc.speak();
        System.out.println("---------------------");
        //3、测试篮球教练
        BasketballCoach bc = new BasketballCoach("姚明", 38);
        System.out.println(bc.getName() + "..." + bc.getAge());
        bc.eat();
        bc.teach();
        System.out.println("---------------------");
        //4、测试篮球运动员
        BasketballPlayer bp = new BasketballPlayer("易建联", 35);
        System.out.println(bp.getName() + "..." + bp.getAge());
        bp.eat();
        bp.study();
    }
}
