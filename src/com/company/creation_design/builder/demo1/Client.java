package com.company.creation_design.builder.demo1;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike construct = director.construct();
        System.out.println(construct);
    }
}
