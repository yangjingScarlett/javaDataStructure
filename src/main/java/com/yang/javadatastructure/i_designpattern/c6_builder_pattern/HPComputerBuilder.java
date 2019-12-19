package com.yang.javadatastructure.i_designpattern.c6_builder_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class HPComputerBuilder extends ComputerBuilder {
    @Override
    void buildMaster() {
        Master master = new Master("i7,16g,512SSD,1060", 7, "HP");
        computer.setMaster(master);
    }

    @Override
    void buildMonitor() {
        Monitor monitor = new Monitor("HP", 1080);
        computer.setMonitor(monitor);
    }

    @Override
    void buildKeyboard() {
        Keyboard keyboard = new Keyboard("cherry mechanical keyboard", "HP", 430.50);
        computer.setKeyboard(keyboard);
    }

    @Override
    void buildMouse() {
        Mouse mouse = new Mouse("MI mouse", "HP", 130.50);
        computer.setMouse(mouse);
    }
}
