package com.fckey.design.bridge;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname White
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/13 08:32
 **/
public class White implements Color{

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}