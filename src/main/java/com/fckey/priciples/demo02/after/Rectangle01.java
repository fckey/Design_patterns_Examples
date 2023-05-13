package com.fckey.priciples.demo02.after;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Rectangle
 * @Description
 * @createTime 2022/05/28 9:10
 **/
public class Rectangle01 implements com.fckey.principles.demo02.after.Quadrilateral {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
