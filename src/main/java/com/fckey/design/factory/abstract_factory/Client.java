package com.fckey.design.factory.abstract_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description 测试类
 * @createTime 2022/05/28 20:02
 **/
public class Client {
    public static void main(String[] args) {
        // 1. 创建意大利风味甜品工厂
        ItalyDessertFactory factory = new ItalyDessertFactory();
        // 2. 获取拿铁咖啡和提拉米苏
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
