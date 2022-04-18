package com.design.construct_design.proxy.static_proxy;

/**
 * 真实主题类-火车站
 *
 * @Author zj
 * @Date 2022/4/18
 */
public class TrainStation implements SellTicket {
    public void sell() {
        System.out.println("火车站票开卖啦！");
    }
}
