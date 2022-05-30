package com.fangshaolei.design.prototype.demo;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/29 8:09
 **/
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建一个原型对象
        Realizetype realizetype = new Realizetype();
        // 2. 调用Realizetype类中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();
        // 3. 打印出来的不是同一个对象
        System.out.println(realizetype);
        System.out.println(clone);
    }
}
