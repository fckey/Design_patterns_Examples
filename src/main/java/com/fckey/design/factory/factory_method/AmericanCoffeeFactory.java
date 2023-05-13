package com.fckey.design.factory.factory_method;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName AmericanCoffeeFactory
 * @Description 专门生产美式咖啡的工厂
 * @createTime 2022/05/28 19:35
 **/
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
