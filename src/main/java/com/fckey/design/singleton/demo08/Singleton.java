package com.fckey.design.singleton.demo08;


/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Singleton
 * @Description
 * @createTime 2022/05/28 15:31
 **/
public class Singleton {

    private Singleton(){}

    public static class  SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
