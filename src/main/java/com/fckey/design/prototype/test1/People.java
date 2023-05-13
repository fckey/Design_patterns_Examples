package com.fckey.design.prototype.test1;

import java.io.Serializable;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName People
 * @Description
 * @createTime 2022/05/29 8:18
 **/
public class People implements Serializable {
        // 姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
