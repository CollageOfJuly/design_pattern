package com.design.creation_design.builder.demo1;

/**
 * 指挥者-自行车建造指挥者
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
