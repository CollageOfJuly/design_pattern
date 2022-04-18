package com.design.construct_design.proxy.dynamic_proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂-获取cglib代理对象-通过子类来实现
 * 通过Enhancer，以及工厂类实现MethodInterceptor接口实现
 *
 * @Author zj
 * @Date 2022/4/18
 */
public class ProxyFactory implements MethodInterceptor {
    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象，即真实主题作为父类
        enhancer.setSuperclass(trainStation.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    /*
        intercept方法参数说明：
            o ： 代理对象
            method ： 真实对象中的方法的Method实例
            objects ： 实际参数
            methodProxy ：代理对象中的方法的method实例
     */
    public TrainStation intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强内容...");
        TrainStation result = (TrainStation) method.invoke(trainStation, objects);
        return result;
    }
}
