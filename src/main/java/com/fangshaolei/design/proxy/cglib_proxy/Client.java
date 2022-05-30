package com.fangshaolei.design.proxy.cglib_proxy;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/30 10:58
 **/
public class Client {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        // 调用代理对象中的方法进行卖票
        proxyObject.sell();
    }
}
