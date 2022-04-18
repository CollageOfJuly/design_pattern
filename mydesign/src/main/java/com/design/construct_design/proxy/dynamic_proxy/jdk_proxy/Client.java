package com.design.construct_design.proxy.dynamic_proxy.jdk_proxy;

/**
 * @Author zj
 * @Date 2022/4/18
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        proxyObject.getTicketValue();
    }
}
