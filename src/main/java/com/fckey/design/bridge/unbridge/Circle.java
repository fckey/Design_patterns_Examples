package com.fckey.design.bridge.unbridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Circle
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:46
 **/
public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("蓝色的圆形" );
    }
}