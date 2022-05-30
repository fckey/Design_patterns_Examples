package com.fangshaolei.design.prototype.test1;

import java.io.*;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName CitationTest
 * @Description
 * @createTime 2022/05/29 8:15
 **/
public class CitationTest {
    public static void main(String[] args) throws Exception {
        // 1. 创建原型对象
        Citation citation1 = new Citation();
        // 2. 创建一个people对象
        People people = new People();
        people.setName("zhangsan");
        citation1.setPeople(people);

        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\fangshaolei\\Desktop\\a.txt"));
        // 写对象
        oos.writeObject(citation1);
        // 释放资源
        oos.close();

        // 读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\fangshaolei\\Desktop\\a.txt"));
        // 读取对象
        Citation citation2 = (Citation) ois.readObject();
        ois.close();

        citation2.getPeople().setName("wangwu");

        System.out.println(citation1.getPeople().getName());
        System.out.println(citation2.getPeople().getName());
    }
}
