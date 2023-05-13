package com.fckey.principles.demo3.after;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName ComputerDemo
 * @Description
 * @createTime 2022/05/28 11:22
 **/
public class ComputerDemo {
    public static void main(String[] args) {
        LenovoComputer computer = new LenovoComputer();

        // 创建组件对象
        CPU cpu = new IntelCPU();
        HardDisk dick = new SeagateDisk();
        Memory memory = new SamsungMemory();

        // 组装
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setDisk(dick);

        computer.run();
    }
}
