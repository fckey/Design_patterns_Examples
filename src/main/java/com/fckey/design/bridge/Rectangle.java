package com.fckey.design.bridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Rectangle
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:44
 **/
public class Rectangle extends Shape{
    @Override
    public void draw() {
        color.bepaint("长方形");
    }
}