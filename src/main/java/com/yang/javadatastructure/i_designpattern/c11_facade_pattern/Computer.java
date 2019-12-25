package com.yang.javadatastructure.i_designpattern.c11_facade_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class Computer {

    private Memory memory;
    private CPU cpu;
    private HardDrive hardDrive;

    public Computer() {
        this.memory = new Memory(16);
        this.cpu = new CPU("Intel(R)", "Core(TM) i7");
        this.hardDrive = new HardDrive(500);
    }

    public void run() {
        memory.load();
        hardDrive.readData();
        cpu.processData();
    }
}
