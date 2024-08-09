package com.itheima.demo10_exercise;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("刘亦菲");
        t1.setAge(17);
        System.out.println(t1.getName() + "..." + t1.getAge());
        t1.eat();
        t1.teach();
        System.out.println("--------------------");

        Teacher t2 = new Teacher("赵丽颖", 31);
        System.out.println(t2.getName() + "..." + t2.getAge());
        t2.eat();
        t2.teach();
        System.out.println("--------------------");

        Student s1 = new Student();
        s1.setName("小明");
        s1.setAge(6);
        System.out.println(s1.getName() + "..." + s1.getAge());
        s1.eat();
        s1.study();
        System.out.println("---------------------");

        Student s2 = new Student("石头",9);
        System.out.println(s2.getName() + "..." + s2.getAge());
        s2.eat();
        s2.study();
        System.out.println("---------------------");
    }
}
