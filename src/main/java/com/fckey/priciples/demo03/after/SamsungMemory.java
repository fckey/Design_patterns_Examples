package com.fckey.principles.demo3.after;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SamsungMemory
 * @Description
 * @createTime 2022/05/28 11:20
 **/
public class SamsungMemory implements Memory{
    @Override
    public void save() {
        System.out.println("using samsung memory");
    }
}
