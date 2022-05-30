package com.fangshaolei.design.factory.abstract_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName DessertFactory
 * @Description
 * @createTime 2022/05/28 19:58
 **/
public interface DessertFactory {
    // 生产咖啡的功能
    Coffee createCoffee();

    // 生产甜品的功能
    Dessert createDessert();
}
