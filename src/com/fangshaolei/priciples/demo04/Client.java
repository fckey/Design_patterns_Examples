package com.fangshaolei.principles.demo04;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 12:10
 **/
public class Client {
    public static void main(String[] args) {
        RedMiPhone phone = new RedMiPhone();
        phone.call();
        phone.listenMusic();
        phone.online();

        NokiaPhone nokiaPhone = new NokiaPhone();
        nokiaPhone.call();
        nokiaPhone.listenMusic();
    }
}
