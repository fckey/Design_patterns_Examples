package com.fckey.principles.demo02.before;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Square
 * @Description
 * @createTime 2022/05/28 9:02
 **/
public class Square02 extends com.fckey.principles.demo02.before.Rectangle02 {
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }
}
