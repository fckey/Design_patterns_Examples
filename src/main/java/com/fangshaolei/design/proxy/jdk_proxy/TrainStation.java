package com.fangshaolei.design.proxy.jdk_proxy;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName TrainStation
 * @Description 火车站，实现具体的卖票功能
 * @createTime 2022/05/30 9:36
 **/
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
