package com.fangshaolei.design.factory.before;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName CoffeeStore
 * @Description 定义一个咖啡店
 * @createTime 2022/05/28 19:07
 **/
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        // 声明咖啡的变量，根据不同的类型创建不同的coffee的咖啡子类对象
        Coffee coffee = null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，你点的咖啡，我们店里并没有");
        }
        // 加配料
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
