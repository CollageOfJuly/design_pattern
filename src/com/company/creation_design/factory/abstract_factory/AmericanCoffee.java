package com.company.creation_design.factory.abstract_factory;

/**
 * 具体咖啡-美式咖啡
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class AmericanCoffee extends Coffee {
    @Override
    public void getName() {
        System.out.println("美式咖啡");
    }
}
