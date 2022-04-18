package com.design.creation_design.singleton.destroy_singleton;

import java.io.Serializable;

/**
 * 单例模式-懒汉式-方式4
 * 静态内部类
 * 强力推荐使用
 *
 * @Author zj
 * @Date 2022/4/13
 */
public class Singleton4 implements Serializable {
    /**
     * 私有化构造方法
     */
    private Singleton4() {};

    /**
     * 静态内部类加载单例模式
     * 静态内部类只有其成员被调用时，才会被类加载器加载，符合单例实例化
     */
    private static class Singleton4Holder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Singleton4Holder.INSTANCE;
    }

    /**
     * 重写readResolve方法，防止反序列化时破坏了单例模式
     * @return 单例对象
     */
    private Object readResolve() {
        return Singleton4Holder.INSTANCE;
    }
}
