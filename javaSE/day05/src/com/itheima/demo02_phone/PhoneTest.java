package com.itheima.demo02_phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "苹果";
        p.price = 8999;
        p.colour = "黑色";
        System.out.println(p.brand + "--" + p.price + "--" + p.colour);
        p.call("李运杰");
        p.textmessage("小石头");

        Phone p1 = new Phone();
        p1.brand = "三星";
        p1.price = 6999;
        p1.colour = "白色";
        System.out.println(p1.brand + "--" + p1.price + "--" + p1.colour);
        p.call("李1");
        p.textmessage("小1");
        System.out.println("----------------");
        Phone p2 = p;
        p2.brand = "三星";
        p2.price = 6999;
        p2.colour = "白色";
        System.out.println(p.brand + "--" + p.price + "--" + p.colour);
        System.out.println(p2.brand + "--" + p2.price + "--" + p2.colour);
        p2.call("李1");
        p2.textmessage("小1");
    }
}
