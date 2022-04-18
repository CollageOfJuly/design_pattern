package com.design.creation_design.builder.demo3;

/**
 * 产品类-自行车
 *
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

    private Bike(BikeBuilder bikeBuilder) {
        this.frame = bikeBuilder.getFrame();
        this.seat = bikeBuilder.getSeat();
    }

    public static class BikeBuilder {
        private String frame;

        private String seat;

        public String getFrame() {
            return frame;
        }

        public String getSeat() {
            return seat;
        }

        public BikeBuilder frame(String frame) {
            this.frame = frame;
            return this;
        }

        public BikeBuilder seat(String seat) {
            this.seat = seat;
            return this;
        }

        public Bike build() {
            return new Bike(this);
        }
    }
}
