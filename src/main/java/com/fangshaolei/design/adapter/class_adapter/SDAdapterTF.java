package com.fangshaolei.design.adapter.class_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SDAdapterTF
 * @Description 定义适配器类，用来适配其他接口到SD接口的装换
 * @createTime 2022/05/30 15:23
 **/
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
