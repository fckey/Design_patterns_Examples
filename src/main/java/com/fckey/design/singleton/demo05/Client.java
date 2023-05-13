package com.fckey.design.singleton.demo05;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 15:28
 **/
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2 == instance);
    }
}
