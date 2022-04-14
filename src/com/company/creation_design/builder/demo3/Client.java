package com.company.creation_design.builder.demo3;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 将建造者和指挥者的任务交给客户端来实现
         */
        Bike build = new Bike.BikeBuilder()
                .frame("碳纤维车架")
                .seat("橡胶车座")
                .build();
        System.out.println(build);
    }
}
