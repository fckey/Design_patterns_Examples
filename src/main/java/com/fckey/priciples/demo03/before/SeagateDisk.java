package com.fckey.principles.demo3.before;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SeagateDisk
 * @Description
 * @createTime 2022/05/28 10:56
 **/
public class SeagateDisk {

    // 存储数据的方法
    public void save(String data){
        System.out.println("SeagateDisk saving..." + data);
    }

    public String get(){
        System.out.println("SeagateDisk reading... ");
        return "data";
    }
}
