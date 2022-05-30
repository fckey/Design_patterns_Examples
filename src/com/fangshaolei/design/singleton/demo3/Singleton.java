package com.fangshaolei.design.singleton.demo3;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Singleton
 * @Description
 * @createTime 2022/05/28 14:37
 **/
public class Singleton {
    // 私有构造方法
    private Singleton(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 声明singleton类型变量为instance
    private static Singleton instance; // 只是声明，没有赋值
    // 提供对外访问

    public  static  Singleton getInstance(){
        // 判断instance是否是null，如果是null,说明还没有创建singlton对象
        if(instance == null) instance = new Singleton();
        return instance;
    }
}
