package com.fangshaolei.design.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName ProxyFactory
 * @Description 代理对象工厂，主要为了获取代理对象
 * @createTime 2022/05/30 10:53
 **/
public class ProxyFactory implements MethodInterceptor {
    // 声明火车站对象
    private TrainStation station = new TrainStation();

    // cglib的代理类是属于目标类的子类
    public TrainStation getProxyObject(){
        // TODO. 创建Enchancer对象，类似于JDK代理中的proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject  = (TrainStation) enhancer.create();
        return proxyObject;
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取一定的服务费用（cglib的代理）");
//        station.sell();
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
