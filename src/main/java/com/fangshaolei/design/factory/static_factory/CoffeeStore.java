package com.fangshaolei.design.factory.static_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName CoffeeStore
 * @Description 咖啡店
 * @createTime 2022/05/28 19:15
 **/
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        // 1. 创建一个咖啡工厂
        Coffee coffee = SimpleCoffeeFactory.createCoffee("american");
        // 加糖，加奶
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
