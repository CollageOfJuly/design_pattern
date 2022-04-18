package com.design.construct_design.proxy.static_proxy;

/**
 * 客户端
 *
 * @Author zj
 * @Date 2022/4/18
 */
public class Client {
    public static void main(String[] args) {
        TicketProxy ticketProxy = new TicketProxy();
        ticketProxy.sell();
    }
}
