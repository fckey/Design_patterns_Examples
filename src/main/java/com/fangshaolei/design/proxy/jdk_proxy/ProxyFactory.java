package com.fangshaolei.design.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName ProxyFactory
 * @Description 获取代理对象的工厂类
 * @createTime 2022/05/30 9:46
 **/
public class ProxyFactory {
    // 声明目标对象
    private TrainStation station = new TrainStation();
    // 获取代理对象的方法
    public SellTickets getProxyObject(){
        // 返回代理对象即可
        /*
            ClassLoader loader, 类加载器，用于加载代理类，可以通过目标对象获取类加载器
            Class<?>[] interfaces, 代理类实现的接口字节码对象
            InvocationHandler h) 代理对象的调用程序（比如说固定的接口）

         */
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {

                    /*
                    Object proxy: 代理对象，和proxyObject对象是同一个对象，在invoke中基本上是不用的
                    Method method:  对接口中的方法进行封装的method对象
                    Object[] args: 调用方法的实际参数
                    返回值： 方法的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke执行了...");
                        // 执行目标对象的方法
                        System.out.println("收取一定的服务费用（jdk动态代理）");
                        Object object = method.invoke(station, args);
                        // 直接将方法的参数进行返回，这里没有参数返回，可以直接是空，但是，建议直接其进行返回
                        System.out.println("买票之后，说了声谢谢");
                        return object;
                    }
                }
        );

        return sellTickets;
    }
}
