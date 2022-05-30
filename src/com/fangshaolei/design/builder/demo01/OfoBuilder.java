package com.fangshaolei.design.builder.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName OfoBuilder
 * @Description
 * @createTime 2022/05/29 10:34
 **/
public class OfoBuilder extends Builder{
    @Override
    public void buildSeat() {
        bike.setSeat("橡胶坐垫");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
