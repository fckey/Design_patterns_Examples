package com.fckey.design.factory.simple_factory;

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
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        // 加糖，加奶
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
