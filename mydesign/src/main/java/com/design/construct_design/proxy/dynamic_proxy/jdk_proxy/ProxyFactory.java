package com.design.construct_design.proxy.dynamic_proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂-获取jdk动态代理对象-通过接口来实现
 * 通过Proxy.newProxyInstance()方法实现
 *
 * @Author zj
 * @Date 2022/4/18
 */
public class ProxyFactory {
    private TrainStation trainStation = new TrainStation();

    public SellTicket getProxyObject() {
        /**
         * 使用Proxy获取代理对象
         * newProxyInstance方法参数说明
         * ClassLoader loader：类加载器，用于加载代理类，使用真实对象的类加载器即可
         * Class<?>[] interfaces：真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
         * InvocationHandler h：代理对象的调用处理接口，代理对象每次方法的调用都会执行该接口实现类的invoke方法
         */
        SellTicket proxyObject = (SellTicket) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(), new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("sell")) {
                            System.out.println("只增强sell方法..");
                        }
                        // 反射执行真实主题中的方法，result为方法的返回值
                        Object result = method.invoke(trainStation, args);
                        return result;
                    }
                });
        // proxyObject代理对象实现了抽象主题
        return proxyObject;
    }
}
