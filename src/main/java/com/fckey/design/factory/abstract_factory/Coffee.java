package com.fckey.design.factory.abstract_factory;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Coffee
 * @Description 咖啡类的抽象
 * @createTime 2022/05/28 19:13
 **/
public abstract class Coffee {
    // 获取当前咖啡的名字
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
