package com.fckey.design.singleton.demo02;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Singleton
 * @Description
 * @createTime 2022/05/28 14:33
 **/
public class Singleton {
    // 1. 私有化构造方法，让外界不能创建
    private Singleton(){}

    // 声明类型变量，但是没有赋值
    private static Singleton instance; // null

    // 静态代码块赋值
    static{
        instance = new Singleton();
    }

    public static  Singleton getInstance(){
        return instance;
    }
}
