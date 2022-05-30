package com.fangshaolei.design.adapter.class_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description 具体的客户端类，用来读取卡中的数据
 * @createTime 2022/05/30 15:21
 **/
public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        System.out.println("======= reading =======");
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("======= readTF =======");

        // 使用该电脑读取TF卡中的数据
        // 定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
