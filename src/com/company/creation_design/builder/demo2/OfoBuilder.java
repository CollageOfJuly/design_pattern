package com.company.creation_design.builder.demo2;

/**
 * 具体建造者类-OFO自行车建造
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }
}
