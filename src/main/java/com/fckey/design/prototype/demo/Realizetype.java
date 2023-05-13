package com.fckey.design.prototype.demo;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Realizetype
 * @Description
 * @createTime 2022/05/29 8:07
 **/
public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("具体的原型对象创建完成");
    }

    // 这是一个克隆
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体的原型对象复制成功!");
        return (Realizetype) super.clone();
    }
}
