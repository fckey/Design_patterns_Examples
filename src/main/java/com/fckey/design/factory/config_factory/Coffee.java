package com.fckey.design.factory.config_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Coffee

表示的当前是一个咖啡，但是咖啡都有加奶和加糖的操作
 * @Description
 * @createTime 2022/05/28 19:02
 **/
public abstract class Coffee {
    // 获取具体的名字
    public abstract String getName();

    // 加糖
    public void addSugar(){
        System.out.println("加糖");
    }
    // 加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
