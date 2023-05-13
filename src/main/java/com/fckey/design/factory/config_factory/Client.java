package com.fckey.design.factory.config_factory;


/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 20:22
 **/
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
        // 拿铁咖啡
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());

    }
}
