package com.fckey.design.singleton.demo04;

import com.fckey.design.singleton.demo3.Singleton;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 14:44
 **/
public class Client {
    private final static int THREAD_NUMBER = 200000;
    public static void main(String[] args) {
        for (int i = 0; i < THREAD_NUMBER; i++) {
            new Thread("thread"+ i){
                @Override
                public void run() {
                   Singleton instance = Singleton.getInstance();
                   if(instance == null) {
                       System.out.println("yes");
                   }
                }
            }.start();
        }
    }
}
