package com.yang.javadatastructure.i_designpattern.c6_builder_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class Director {

    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer() {
        computerBuilder.buildComputer("Jing's computer");
        computerBuilder.buildMaster();
        computerBuilder.buildMonitor();
        computerBuilder.buildKeyboard();
        computerBuilder.buildMouse();
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }
}
