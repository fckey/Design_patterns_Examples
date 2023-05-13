package com.fckey.design.builder.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Builder
 * @Description
 * @createTime 2022/05/29 10:31
 **/
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildSeat();

    public abstract  void buildFrame();

    // 构建自行车的方法
    public abstract Bike createBike();
}
