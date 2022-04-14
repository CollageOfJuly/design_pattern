package com.company.creation_design.builder.demo1;

/**
 * 抽象建造者类-自行车建造
 *
 * @Author zj
 * @Date 2022/4/14
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public Bike createBike() {
        return bike;
    }
}
