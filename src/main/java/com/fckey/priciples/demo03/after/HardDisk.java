package com.fckey.principles.demo3.after;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName HardDisk
 * @Description
 * @createTime 2022/05/28 11:08
 **/
public interface HardDisk {
    // 存储数据的方法
    public void save(String data);
    // 获取数据
    public String get();
}
