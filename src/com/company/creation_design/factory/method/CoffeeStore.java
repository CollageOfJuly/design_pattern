package com.company.creation_design.factory.method;

/**
 * 咖啡店
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {

        return coffeeFactory.createCoffee();
    }
}
