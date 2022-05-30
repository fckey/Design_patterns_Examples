package com.fangshaolei.principles.demo02.after;
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
       Rectangle rectangle = new Rectangle();
        // 设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // re'si'ze进行扩张
        resize(rectangle);
        printLengthAndWidth(rectangle);
//        正方形
        Square square = new Square();
        square.setSide(10);
        printLengthAndWidth(square);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle){
        // 判断如果宽比长小
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength() + " : " + quadrilateral.getWidth());
    }

}
