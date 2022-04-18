package com.design.creation_design.factory.method;

/**
 * 抽象咖啡工厂类
 *
 * @Author zj
 * @Date 2022/4/14
 */
public abstract class CoffeeFactory {
    /**
     * abstract和static不能同时存在，因为static修饰的方法可以直接调用，但abstract修饰的方式不能直接调用，因为没有方法体
     */
    public abstract Coffee createCoffee();
}
