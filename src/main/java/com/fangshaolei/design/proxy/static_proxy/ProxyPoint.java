package com.fangshaolei.design.proxy.static_proxy;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName ProxyPoint
 * @Description 在乡镇的代理站点来进行卖票
 * @createTime 2022/05/30 9:38
 **/
public class ProxyPoint implements SellTickets{

    // 声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("火车代理点收取一定的服务费用");
        trainStation.sell();
        System.out.println("买票之后，说了声谢谢");
    }
}
