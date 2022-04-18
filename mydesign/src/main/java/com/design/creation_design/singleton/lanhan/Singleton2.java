package com.design.creation_design.singleton.lanhan;

/**
 * 单例模式-懒汉式-方式2
 * 加锁单检查
 * 缺点：线程安全，但getInstance方法因为加了方法锁，一次只能有一个线程进入方法，执行效率太低
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class Singleton2 {
    private static Singleton2 instance;

    /**
     * 私有化构造方法
     */
    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
