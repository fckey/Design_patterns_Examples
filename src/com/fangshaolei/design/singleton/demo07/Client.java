package com.fangshaolei.design.singleton.demo07;

import org.w3c.dom.ls.LSInput;

import java.io.*;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 15:33
 **/
public class Client {
    public static void main(String[] args) throws Exception {
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\fangshaolei\\Desktop\\a.txt"));
       Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
    }

    // 向文件中写数据
    public static void writeObject2File () throws Exception{
        // 1.获取singleton对象
        Singleton instance = Singleton.getInstance();
        // 2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\fangshaolei\\Desktop\\a.txt"));
        // 3. 写对象
        oos.writeObject(instance);
        // 4. 释放资源
        oos.close();
    }

}
