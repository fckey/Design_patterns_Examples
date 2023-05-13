package com.fckey.design.adapter.simple_adapter;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName Operator
 * @Description 测试缺省类的时候
 * @createTime 2022/05/30 15:38
 **/
public class Operator  {
    private SampleOperation sampleOperation;

    public void addOperation(SampleOperation sampleOperation) {
        this.sampleOperation = sampleOperation;
    }

    public void operation1() {
        sampleOperation.Opertion1();
    }

    public void operation2() {
        sampleOperation.Opertion2();
    }

    public void operation3() {
        sampleOperation.Opertion3();
    }

    public void operation4() {
        sampleOperation.Opertion4();
    }

    public void operation5() {
        sampleOperation.Opertion5();
    }
}
