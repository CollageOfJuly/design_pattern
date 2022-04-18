package com.design.creation_design.factory.abstract_factory;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class ItalyCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Desset createDesset() {
        return new MatchaMousse();
    }
}
