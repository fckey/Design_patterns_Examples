package com.fangshaolei.design.adapter.object_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Computer
 * @Description 计算机类，进行各种SD卡的读取操作
 * @createTime 2022/05/30 15:20
 **/
public class Computer {
    // 从SD卡中读取数据
    public String readSD(SDCard sdCard){
        if(sdCard == null) throw new NullPointerException("sd card is not null");
        return sdCard.readSD();
    }
}
