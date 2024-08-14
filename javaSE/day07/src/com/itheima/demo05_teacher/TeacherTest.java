package com.itheima.demo05_teacher;

public class TeacherTest {
    public static void main(String[] args) {
        //抽象类版的多态
        BasicTeacher bt = new BasicTeacher();
        bt.setName("刘亦菲");
        bt.setAge(33);
        System.out.println(bt.getName() + "..." + bt.getAge());
        bt.teach();
        BasicTeacher bt1 = new BasicTeacher("赵丽颖", 28);
        System.out.println(bt1.getName() + "..." + bt1.getAge());
        bt1.teach();
        System.out.println("------------------");

        WorkTeacher wt = new WorkTeacher();
        wt.setName("刘亦菲");
        wt.setAge(33);
        System.out.println(wt.getName() + "..." + wt.getAge());
        wt.teach();
        WorkTeacher wt1 = new WorkTeacher("赵丽颖", 28);
        System.out.println(wt1.getName() + "..." + wt1.getAge());
        wt1.teach();

    }
}
