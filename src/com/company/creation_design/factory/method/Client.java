package com.company.creation_design.factory.method;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();
    }
}
