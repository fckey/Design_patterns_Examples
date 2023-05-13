package com.fckey.design.factory.abstract_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName ItalyDessertFactory
 * @Description
 * @createTime 2022/05/28 20:01
 **/
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return  new Trimisu();
    }
}
