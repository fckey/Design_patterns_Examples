package com.fckey.design.factory.abstract_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName AmericanDessertFactory
 * @Description
        美式风味的工厂
            生产美式咖啡和
 * @createTime 2022/05/28 19:59
 **/
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
