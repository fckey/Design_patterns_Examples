package com.fckey.design.decorators;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname DataSource
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/19 10:34
 **/
public interface DataSource {
    void writeData(String data);
    String readData();
}