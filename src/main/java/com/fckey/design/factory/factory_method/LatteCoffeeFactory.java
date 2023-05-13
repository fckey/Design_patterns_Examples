package com.fckey.design.factory.factory_method;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName LatteCoffeeFactory
 * @Description 专门生产拿铁咖啡的工厂
 * @createTime 2022/05/28 19:35
 **/
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
