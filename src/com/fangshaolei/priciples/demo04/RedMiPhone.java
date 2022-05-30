package com.fangshaolei.principles.demo04;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName RedMiPhone
 * @Description
 * @createTime 2022/05/28 12:08
 **/
public class RedMiPhone implements Phone{
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void listenMusic() {
        System.out.println("听音乐");
    }

    @Override
    public void online() {
        System.out.println("上网");
    }
}
