package com.company.creation_design.factory.simple;

import com.company.creation_design.factory.constants.CoffeeConstants;

/**
 * 咖啡工厂类
 * 耦合度过高，当新增新的产品时，会修改简单工厂类，违背了开闭原则
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class CoffeeFactory {

    public static Coffee getCoffee(String name) {
        if (CoffeeConstants.AMERICAN_COFFEE.equals(name)) {
            AmericanCoffee americanCoffee = new AmericanCoffee();
            return americanCoffee;
        }
        if (CoffeeConstants.LATTE_COFFEE.equals(name)) {
            LatteCoffee latteCoffee = new LatteCoffee();
            return latteCoffee;
        }
        System.out.println("没有你想要的咖啡");
        return null;
    }
}
