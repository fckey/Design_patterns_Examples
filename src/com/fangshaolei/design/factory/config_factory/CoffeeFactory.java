package com.fangshaolei.design.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName CoffeFactory
 * @Description
 * @createTime 2022/05/28 20:13
 **/
public class CoffeeFactory {
    // 加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储起来
    // 1. 定义容器对象存储咖啡对象
    private static  HashMap<String,Coffee> ioc = new HashMap<>();

    // 2. 加载配置文件，只需加载一次
    static{
        // 2.1 创建properties对象
        Properties properties = new Properties();
        // 2.2 调用properties对象中的load方法进行配置文件的加载
        InputStream is = com.fangshaolei.design.factory.factory_method.CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            // 从p集合中获取全类名，并创建对象
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String)key);
                // 通过反射技术创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.getDeclaredConstructor().newInstance();
                // 将名称和对象存储到容器中
                ioc.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 根据名称获取对象
    public static Coffee createCoffee(String name){
        return ioc.get(name);
    }
}
