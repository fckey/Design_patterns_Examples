package com.fangshaolei.design.singleton.demo05;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Singleton
 * @Description
 * @createTime 2022/05/28 15:26
 **/
public class Singleton {

    // 私有构造方法
    private Singleton(){}

    public static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    // 对外提供静态方法获取该对象
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
