package com.fangshaolei.design.adapter.object_adapter;

import com.fangshaolei.design.adapter.class_adapter.TFCardImpl;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SDAdapterTF
 * @Description 定义适配器类，用来适配其他接口到SD接口的装换
 * @createTime 2022/05/30 15:23
 **/
public class SDAdapterTF implements SDCard {
    // 声明适配类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
