package com.fckey.design.decorators;

/**
 * @version 1.0
 * @program: Design_patterns_Examples
 * @classname DataSourceDecorator
 * @description: None
 * @author: Jeff Fong
 * @create: 2023/05/19 10:36
 **/
public class DataSourceDecorator implements DataSource{
    private DataSource wrappee;
    DataSourceDecorator(DataSource dataSource){
        this.wrappee = dataSource;
    }
    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}