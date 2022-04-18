package com.design.creation_design.factory.simple;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Coffee latteCoffee = CoffeeStore.orderCoffee("LatteCoffee");
        latteCoffee.getName();
    }
}
