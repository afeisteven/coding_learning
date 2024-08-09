package com.itheima.demo09_Override;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone ();
        p.call("刘亦菲");
        System.out.println("-------------");
        NewPhone np = new NewPhone();
        np.call("刘亦菲");

    }
}
