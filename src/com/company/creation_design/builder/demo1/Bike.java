package com.company.creation_design.builder.demo1;

/**
 * 产品类-自行车
 *
 * @Author zj
 * @Date 2022/4/14
 */
public class Bike {
    private String frame;

    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
