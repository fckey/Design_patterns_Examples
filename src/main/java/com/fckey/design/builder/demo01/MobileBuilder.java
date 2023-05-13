package com.fckey.design.builder.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName MobileBuilder
 * @Description
 * @createTime 2022/05/29 10:32
 **/
public class MobileBuilder extends Builder{
    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("炭纤维车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
