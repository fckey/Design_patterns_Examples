package com.fangshaolei.principles.demo3.before;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName ComputerDemo
 * @Description
 * @createTime 2022/05/28 11:03
 **/
public class ComputerDemo {
    public static void main(String[] args) {
        LenovoComputer computer = new LenovoComputer();
        // 创建组件对象
        IntelCPU cpu = new IntelCPU();
        SamsungMemory memory = new SamsungMemory();
        SeagateDisk disk = new SeagateDisk();

        computer.setCpu(cpu);
        computer.setDisk(disk);
        computer.setMemory(memory);

        computer.run();
    }
}
