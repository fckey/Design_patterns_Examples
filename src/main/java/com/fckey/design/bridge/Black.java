package com.fckey.design.bridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname Black
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:33
 **/
public class Black implements Color{

    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}