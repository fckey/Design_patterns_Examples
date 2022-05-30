package com.fangshaolei.principles.demo02.after;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Square
 * @Description
 * @createTime 2022/05/28 9:09
 **/
public class Square implements Quadrilateral{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
