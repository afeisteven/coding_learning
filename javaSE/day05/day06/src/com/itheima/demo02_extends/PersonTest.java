package com.itheima.demo02_extends;

public class PersonTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("lyf");
        t.setAge(33);
        System.out.println(t.getName() + "---" + t.getAge());
        t.eat();
        t.sleep();
        System.out.println("----------------");
        Student s = new Student();
        s.setName("abc");
        s.setAge(13);
        System.out.println(s.getName() + "---" + s.getAge());
        s.eat();
        s.sleep();
    }
}
