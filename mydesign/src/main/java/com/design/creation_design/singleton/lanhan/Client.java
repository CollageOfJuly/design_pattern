package com.design.creation_design.singleton.lanhan;

/**
 * @Author zj
 * @Date 2022/4/13
 */
public class Client {
    public static void main(String[] args) {
        Singleton1 demo1 = Singleton1.getInstance();
        Singleton1 demo2 = Singleton1.getInstance();
        System.out.println(demo1 == demo2); // true

        Singleton2 demo3 = Singleton2.getInstance();
        Singleton2 demo4 = Singleton2.getInstance();
        System.out.println(demo3 == demo4); // true

        Singleton3 demo5 = Singleton3.getInstance();
        Singleton3 demo6 = Singleton3.getInstance();
        System.out.println(demo5 == demo6); // true

        Singleton4 demo7 = Singleton4.getInstance();
        Singleton4 demo8 = Singleton4.getInstance();
        System.out.println(demo7 == demo8); // true
    }
}
