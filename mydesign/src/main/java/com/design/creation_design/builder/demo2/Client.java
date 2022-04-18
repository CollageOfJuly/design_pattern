package com.design.creation_design.builder.demo2;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) {
        MobikeBuilder mobikeBuilder = new MobikeBuilder();
        // 构建者和指挥者合并
        Bike construct = mobikeBuilder.construct();
        System.out.println(construct);
    }
}
