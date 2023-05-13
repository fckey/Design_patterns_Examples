package com.fckey.design.singleton.demo08;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Client
 * @Description
 * @createTime 2022/05/28 15:43
 **/
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取字节码对象
        Class  clazz = Singleton.class;
        // 获取无参的构造方法
        Constructor cons = clazz.getDeclaredConstructor();
        // 取消访问检查
        cons.setAccessible(true);
        // 创建singleton对象
        Singleton s2 = (Singleton) cons.newInstance();
        Singleton s1 = (Singleton) cons.newInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
