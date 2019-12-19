package com.yang.javadatastructure.i_designpattern.c6_builder_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class BuilderPatternApp {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new HPComputerBuilder();
        Director director = new Director(computerBuilder);
        director.buildComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);
    }
}
