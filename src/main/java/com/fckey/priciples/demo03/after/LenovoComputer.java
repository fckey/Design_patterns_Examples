package com.fckey.principles.demo3.after;

/**
 * @author fangshaolei
 * @version 1.0.0
 * @ClassName LenovoComputer
 * @Description
 * @createTime 2022/05/28 11:20
 **/
public class LenovoComputer {
    private CPU cpu;
    private HardDisk disk;
    private Memory memory;
    public void run(){
        System.out.println("running computer.....");
        String s = disk.get();
        System.out.println("read data from disk is : " + s);
        cpu.run();
        memory.save();
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
