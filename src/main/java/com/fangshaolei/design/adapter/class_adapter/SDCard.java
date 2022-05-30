package com.fangshaolei.design.adapter.class_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SDCard
 * @Description 目标接口
 * @createTime 2022/05/30 15:17
 **/
public interface SDCard {
    // 从SD卡中读取数据
    String readSD();
    // 向SD卡中写数据
    void writeSD(String msg);
}
