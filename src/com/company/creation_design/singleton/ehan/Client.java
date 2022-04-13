package com.company.creation_design.singleton.ehan;

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

        EnumSingleton3 demo5 = EnumSingleton3.INSTANCE;
        EnumSingleton3 demo6 = EnumSingleton3.INSTANCE;
        System.out.println(demo5 == demo6); // true
    }
}
