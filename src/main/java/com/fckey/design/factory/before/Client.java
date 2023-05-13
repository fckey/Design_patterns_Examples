package com.fckey.design.factory.before;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description 顾客，测试
 * @createTime 2022/05/28 19:09
 **/
public class Client {

    public static void main(String[] args) {
//    1. 创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();
        // 2. 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
