package com.fckey.design.bridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Square_Bridge
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:32
 **/
public class Square extends Shape{

    @Override
    void draw() {
        color.bepaint("正方形");
    }
}