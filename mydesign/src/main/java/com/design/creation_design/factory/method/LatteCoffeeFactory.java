package com.design.creation_design.factory.method;

/**
 * 拿铁咖啡工厂实现类
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class LatteCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
