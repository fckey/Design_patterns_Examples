package com.fckey.design.adapter.object_adapter;

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
        // 创建适配类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
