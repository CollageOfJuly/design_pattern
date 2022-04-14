package com.company.creation_design.factory.abstract_factory;

/**
 * 具体产品类-拿铁咖啡
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class LatteCoffee extends Coffee {
    @Override
    public void getName() {
        System.out.println("拿铁咖啡");
    }
}
