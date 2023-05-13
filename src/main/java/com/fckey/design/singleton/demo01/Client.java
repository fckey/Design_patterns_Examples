package com.fckey.design.singleton.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 14:31
 **/
public class Client {
    public static void main(String[] args) {
        // 创建singleton类的对象
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        // 判断是否是同一对象
        System.out.println(singleton2 == singleton);
    }
}
