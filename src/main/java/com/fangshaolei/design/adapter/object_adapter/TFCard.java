package com.fangshaolei.design.adapter.object_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName TFCard
 * @Description 适配者类的接口
 * @createTime 2022/05/30 15:14
 **/
public interface TFCard {
    // 从TF卡中读取数据
    String readTF();
    // 向TF卡中写数据
    void writeTF(String msg);
}
