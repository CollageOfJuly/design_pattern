package com.design.creation_design.singleton.lanhan;

/**
 * 单例模式-饿汉式-方式1
 * 单检查
 * 缺点：线程不安全
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class Singleton1 {
    private static Singleton1 instance;

    /**
     * 私有化构造方法
     */
    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
