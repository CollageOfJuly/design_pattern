package com.design.creation_design.builder.demo2;

/**
 * 具体建造者类-摩拜自行车建造
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }
}
