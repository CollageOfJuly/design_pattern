package com.design.construct_design.proxy.static_proxy;

/**
 * 静态代理类-火车票代理点
 * 编译期就生成的代理类
 *
 * @Author zj
 * @Date 2022/4/18
 */
public class TicketProxy implements SellTicket{
    private TrainStation trainStation = new TrainStation();

    public void sell() {
        System.out.println("增强内容...");
        trainStation.sell();
    }
}
