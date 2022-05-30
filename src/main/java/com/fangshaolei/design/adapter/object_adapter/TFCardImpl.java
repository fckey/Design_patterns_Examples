package com.fangshaolei.design.adapter.object_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName TFCardImpl
 * @Description 适配者类
 * @createTime 2022/05/30 15:16
 **/
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
