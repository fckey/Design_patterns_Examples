package com.fangshaolei.design.proxy.static_proxy;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description 客户端直接进行测试
 * @createTime 2022/05/30 9:40
 **/
public class Client {
    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 调用方法进行买票
        proxyPoint.sell();
    }
}
