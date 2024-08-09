package com.itheima.demo05;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }
  /*
    public void Teacher() {
    }

    public void Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

 */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    /*
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
 */

    public void eat() {
        System.out.println("年龄为" + age + "的" + name + "老师在吃饭");
    }

    public void teach() {
        System.out.println("年龄为" + age + "的" + name + "老师在讲" + content + "，非常亢奋");
    }
}
