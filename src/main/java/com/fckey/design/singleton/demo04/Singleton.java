package com.fckey.design.singleton.demo04;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Singletom
 * @Description
 * @createTime 2022/05/28 15:11
 **/
public class Singleton {
    // 私有化构造方法
    private Singleton(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 创建成员变量
    private static volatile Singleton instance;

    public static Singleton getInstance(){
        // 开始检查
        if(instance == null){
            // 双重检查锁机制
            synchronized (Singleton.class){
                if(instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}
