package com.fangshaolei.design.builder.demo01.demo02;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/29 10:43
 **/
public class Client {
    public static void main(String[] args) {
        // 创建手机对象, 通过构建者模式获取手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("三星")
                .mainBoard("华硕")
                .build();

        System.out.println("phone = " + phone);
    }
}
