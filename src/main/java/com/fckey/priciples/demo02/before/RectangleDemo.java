package com.fckey.principles.demo02.before;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName RectangleDemo
 * @Description
 * @createTime 2022/05/28 9:03
 **/
public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        com.fckey.principles.demo02.before.Rectangle02 rectangle = new com.fckey.principles.demo02.before.Rectangle02();
        // 设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // re'si'ze进行扩张
        resize(rectangle);
        printLengthAndWidth(rectangle);

//        正方形
        com.fckey.principles.demo02.before.Square02 square = new com.fckey.principles.demo02.before.Square02();
        square.setWidth(10);
        resize(square);
        printLengthAndWidth(square);
    }

    // 扩宽方法
    public static void resize(com.fckey.principles.demo02.before.Rectangle02 rectangle){
        // 判断如果宽比长小
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(com.fckey.principles.demo02.before.Rectangle02 rectangle){
        System.out.println(rectangle.getLength() + " : " +rectangle.getWidth());
    }

}
