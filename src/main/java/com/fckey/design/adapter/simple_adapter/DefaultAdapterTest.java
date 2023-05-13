package com.fckey.design.adapter.simple_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName DefaultAdapterTest
 * @Description 缺省适配器模式测试类
 * @createTime 2022/05/30 15:40
 **/
public class DefaultAdapterTest {

    public static void main(String[] args) {

        // 1、原来要实现所有操作类的操作
        Operator operator1 = new Operator();
        operator1.addOperation(new SampleOperation() {
            @Override
            public void Opertion1() {
                System.out.println("操作一");
            }

            @Override
            public void Opertion2() {

            }

            @Override
            public void Opertion3() {

            }

            @Override
            public void Opertion4() {

            }

            @Override
            public void Opertion5() {

            }
        });
        operator1.operation2();

        // 2、使用缺省适配器只需要实现需要用到的接口方法
        Operator operator2 = new Operator();
        operator2.addOperation(new DefaultAdapter() {
            @Override
            public void Opertion1() {
                System.out.println("操作一");
            }
        });
        operator2.operation2();
    }
}
