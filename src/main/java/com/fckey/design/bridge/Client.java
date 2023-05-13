package com.fckey.design.bridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Client
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:39
 **/
public class Client {
    public static void main(String[] args) {
        // 创建第一个类
        Color white = new White();
        // 正方形
        com.fckey.design.bridge.Square squareBridge = new com.fckey.design.bridge.Square();
        // 白色的正方形
        squareBridge.setColor(white);
        squareBridge.draw();

        // 圆形
        com.fckey.design.bridge.Circle circle = new com.fckey.design.bridge.Circle();
        circle.setColor(white);
        circle.draw();
    }
}