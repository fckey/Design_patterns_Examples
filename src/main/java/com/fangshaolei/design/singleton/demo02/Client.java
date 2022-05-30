package com.fangshaolei.design.singleton.demo02;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 14:35
 **/
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 判断是否是同一个对象
        System.out.println("instance == instance2 = " + (instance == instance2));
    }
}
