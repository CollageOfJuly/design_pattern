package com.company.creation_design.factory.abstract_factory;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new ItalyCoffeeFactory();
        Coffee coffee = factory.createCoffee();
        coffee.getName();
        Desset desset = factory.createDesset();
        desset.getName();
    }
}
