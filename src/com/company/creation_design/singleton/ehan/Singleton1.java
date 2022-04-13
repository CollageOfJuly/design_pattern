package com.company.creation_design.singleton.ehan;

/**
 * 单例模式-饿汉式-方式1
 * 静态变量方式
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class Singleton1 {
    private static Singleton1 singleton =  new Singleton1();

    /**
     * 私有化构造方法
     */
    private Singleton1() {};

    public static Singleton1 getInstance() {
        return singleton;
    }
}
