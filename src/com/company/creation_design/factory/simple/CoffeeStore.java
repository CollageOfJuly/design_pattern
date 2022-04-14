package com.company.creation_design.factory.simple;

/**
 * 咖啡店
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class CoffeeStore {
    public static Coffee orderCoffee(String name) throws Exception {

//        return CoffeeFactory.getCoffee(name);
        return PropertiesCoffeeFactory.getCoffee(name);
    }
}
