package com.itheima.demo05;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println("=========");
        System.out.println(t1.getName() + "\t" + t1.getAge() + "\t" + t1.getContent());
        t1.setName("小学生");
        t1.setAge(18);
        t1.setContent("英语绘本");
        System.out.println("=========");
        System.out.println("姓名：" + t1.getName());
        System.out.println("年龄：" + t1.getAge());
        System.out.println("授课内容：" + t1.getContent());
        t1.eat();
        t1.teach();
        System.out.println("--------------");
        Teacher t2 = new Teacher("飞哥", 32, "Java");
    /*    System.out.println(t2.getName() + "\t" + t2.getAge() + "\t" + t2.getContent());
        t2.eat();
        t2.teach();
     */
        System.out.println("姓名：" + t2.getName());
        System.out.println("年龄：" + t2.getAge());
        System.out.println("授课内容：" + t2.getContent());
        t2.eat();
        t2.teach();
        System.out.println("--------------");
    }
}
