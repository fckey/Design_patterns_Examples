package com.fangshaolei.design.factory.factory_method;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description 定义一个测试类，用来测试
 * @createTime 2022/05/28 19:38
 **/
public class Client {
    public static void main(String[] args) {
        // 1. 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        // 创建对象
        CoffeeFactory factory = new AmericanCoffeeFactory();
        // 将工厂对象传递过去
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();

        System.out.println("coffee.getName() = " + coffee.getName());

    }
}
