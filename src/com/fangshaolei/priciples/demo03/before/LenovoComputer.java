package com.fangshaolei.principles.demo3.before;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName LenovoComputer
 * @Description
 * @createTime 2022/05/28 11:01
 **/
public class LenovoComputer {
    private SeagateDisk disk;
    private IntelCPU cpu;
    private SamsungMemory memory;

    public void run(){
        System.out.println("running computer.....");
        String s = disk.get();
        System.out.println("read data from disk is : " + s);
        cpu.run();
        memory.save();
    }

    public SeagateDisk getDisk() {
        return disk;
    }

    public void setDisk(SeagateDisk disk) {
        this.disk = disk;
    }

    public IntelCPU getCpu() {
        return cpu;
    }

    public void setCpu(IntelCPU cpu) {
        this.cpu = cpu;
    }

    public SamsungMemory getMemory() {
        return memory;
    }

    public void setMemory(SamsungMemory memory) {
        this.memory = memory;
    }
}
