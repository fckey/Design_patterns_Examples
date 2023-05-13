package com.fckey.principles.demo3.after;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SeagateDisk
 * @Description
 * @createTime 2022/05/28 11:09
 **/
public class SeagateDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("SeagateDisk saving..." + data);
    }

    @Override
    public String get() {
        System.out.println("SeagateDisk reading... ");
        return "data";
    }
}
