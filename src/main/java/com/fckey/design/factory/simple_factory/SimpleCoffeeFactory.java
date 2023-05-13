package com.fckey.design.factory.simple_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SimpleCoffeeFactory
 * @Description 简单的咖啡工厂类
 * @createTime 2022/05/28 19:16
 **/
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        // 先创建一个coffee类型的变量，根据不同的类型创建不同的子类
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，你要点的咖啡我们没有");
        }
        return coffee;
    }
}
