package com.fangshaolei.design.factory.factory_method;

import com.fangshaolei.design.factory.simple_factory.SimpleCoffeeFactory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName CoffeeStore
 * @Description 咖啡店
 * @createTime 2022/05/28 19:15
 **/
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
