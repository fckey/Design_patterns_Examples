package com.fckey.principles.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 8:29
 **/
public class Client {
    public static void main(String[] args) {
        // 1. 创建搜狗输入法
        SougouInputer inputer = new SougouInputer();
        // 2. 创建默认皮肤
        DefaultSkin defaultSkin = new DefaultSkin();
        inputer.setSkin(defaultSkin);
        // 展示皮肤
        inputer.display();
    }
}
