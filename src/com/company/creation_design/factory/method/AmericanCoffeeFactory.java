package com.company.creation_design.factory.method;

/**
 * 美式咖啡工厂实现类
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class AmericanCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
