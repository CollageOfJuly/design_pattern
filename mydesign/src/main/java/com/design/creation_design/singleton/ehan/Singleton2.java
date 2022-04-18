package com.design.creation_design.singleton.ehan;

/**
 * 单例模式-饿汉式-方式2
 * 静态代码块
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class Singleton2 {
    private static Singleton2 singleton;

    static {
        singleton = new Singleton2();
    }

    /**
     * 私有化构造方法
     */
    private Singleton2() {};

    public static Singleton2 getInstance() {
        return singleton;
    }
}
