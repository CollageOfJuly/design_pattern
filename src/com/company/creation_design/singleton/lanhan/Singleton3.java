package com.company.creation_design.singleton.lanhan;

/**
 * 单例模式-懒汉式-方式3
 * 双重检查锁
 * 线程安全---推荐使用
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class Singleton3 {
    private static volatile Singleton3 instance;

    /**
     * 私有化构造方法
     */
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if (instance == null) {
            synchronized (Singleton3.class) {
                // 第二次判断，抢到锁后再判断，防止多线程实例化对象
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
