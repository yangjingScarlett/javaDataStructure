package com.yang.javadatastructure.i_designpattern.c11_facade_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class CPU {

    private String name;
    private String type;

    public CPU(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void processData() {
        System.out.println("The CPU is processing data...");
    }
}
