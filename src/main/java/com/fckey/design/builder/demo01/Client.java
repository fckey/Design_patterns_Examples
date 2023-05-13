package com.fckey.design.builder.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/29 10:36
 **/
public class Client {
    public static void main(String[] args) {
        // 创建指挥对象
        Director director = new Director(new MobileBuilder());

        Bike construct = director.construct();

        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());
    }
}
