package com.fckey.design.proxy.jdk_proxy;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/30 10:04
 **/
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 3. 调用卖的方法
        proxyObject.sell();
        // https://github.com/alibaba/arthas/releases
        System.out.println(proxyObject.getClass());
        while (true) {

        }
    }
}
