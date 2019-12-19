package com.yang.javadatastructure.i_designpattern.c6_builder_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class DellComputerBuilder extends ComputerBuilder {

    @Override
    void buildMaster() {
        Master master = new Master("i7,32g,1TSSD,1060", 7, "DELL");
        computer.setMaster(master);
    }

    @Override
    void buildMonitor() {
        Monitor monitor = new Monitor("DELL", 4000);
        computer.setMonitor(monitor);
    }

    @Override
    void buildKeyboard() {
        Keyboard keyboard = new Keyboard("normal keyboard", "DELL", 230.00);
        computer.setKeyboard(keyboard);
    }

    @Override
    void buildMouse() {
        Mouse mouse = new Mouse("normal mouse", "DELL", 30.46);
        computer.setMouse(mouse);
    }
}
