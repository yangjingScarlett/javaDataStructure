package com.yang.javadatastructure.i_designpattern.c6_builder_pattern;


/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public abstract class ComputerBuilder {
    protected Computer computer;

    public void buildComputer(String name) {
        computer = new Computer(name);
    }

    abstract void buildMaster();

    abstract void buildMonitor();

    abstract void buildKeyboard();

    abstract void buildMouse();

    public Computer getComputer() {
        return computer;
    }
}
