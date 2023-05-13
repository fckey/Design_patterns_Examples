package com.fckey.design.factory.factory_method;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName CoffeeFactory
 * @Description 定义一个咖啡接口，用来实现工厂的解耦操作
 * @createTime 2022/05/28 19:33
 **/
public interface CoffeeFactory {
    // 创建咖啡对象的方法
    Coffee createCoffee();
}
