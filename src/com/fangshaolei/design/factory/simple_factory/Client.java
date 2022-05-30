package com.fangshaolei.design.factory.simple_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description 实现了咖啡店和咖啡的解耦操作
 * @createTime 2022/05/28 19:22
 **/
public class Client {
    public static void main(String[] args) {
        // 1. 创建一个咖啡店
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");
        // 2. 获取名字
        System.out.println(coffee.getName());
    }
}
