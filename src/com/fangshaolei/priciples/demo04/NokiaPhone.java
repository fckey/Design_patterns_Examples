package com.fangshaolei.principles.demo04;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName NokiaPhone
 * @Description
 * @createTime 2022/05/28 12:12
 **/
public class NokiaPhone implements Callable, ListenMusicable{
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void listenMusic() {
        System.out.println("听音乐");
    }
}
