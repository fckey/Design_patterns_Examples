package com.fangshaolei.principles.demo01;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName SougouInputer
 * @Description
 * @createTime 2022/05/28 8:28
 **/
public class SougouInputer {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin){
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
