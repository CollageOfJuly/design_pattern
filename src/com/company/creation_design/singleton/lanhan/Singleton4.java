package com.company.creation_design.singleton.lanhan;

/**
 * 单例模式-懒汉式-方式4
 * 静态内部类
 * 强力推荐使用
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class Singleton4 {
    /**
     * 私有化构造方法
     */
    private Singleton4() {};

    /**
     * 静态内部类加载单例模式
     * 静态内部类只有其成员被调用时，才会被类加载器加载，符合单例实例化
     */
    private static class Singleton5Holder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Singleton5Holder.INSTANCE;
    }
}
