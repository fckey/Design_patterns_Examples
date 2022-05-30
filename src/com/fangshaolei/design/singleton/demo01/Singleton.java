package com.fangshaolei.design.singleton.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Singleton
 * @Description
        饿汉式： 静态成员变量
 * @createTime 2022/05/28 14:29
 **/
public class Singleton {
    // 1. 私有化构造方法
    private Singleton(){}
    // 2. 在本类中创建本对象
    private static Singleton instance = new Singleton();
    // 3. 提供一个公共的访问方式，让外界获取对象
    public static Singleton getInstance(){
        return instance;
    }
}
