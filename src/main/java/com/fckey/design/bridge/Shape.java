package com.fckey.design.bridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Shape
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:27
 **/
public abstract class Shape {
    abstract void draw();
    Color color;

    public void setColor(Color color){
        this.color = color;
    }

}