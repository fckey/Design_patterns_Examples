package com.fangshaolei.design.adapter.class_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SDCardImpl
 * @Description 具体的SD卡
 * @createTime 2022/05/30 15:18
 **/
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello world SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
