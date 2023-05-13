package com.fckey.design.builder.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Director
 * @Description
 * @createTime 2022/05/29 10:35
 **/
public class Director {
    //
    public Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    // 组装自行车功能
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
