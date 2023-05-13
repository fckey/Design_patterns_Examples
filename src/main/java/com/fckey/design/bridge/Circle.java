package com.fckey.design.bridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Circle
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:30
 **/
public class Circle extends Shape{

    @Override
    void draw() {
        color.bepaint("圆形");
    }
}