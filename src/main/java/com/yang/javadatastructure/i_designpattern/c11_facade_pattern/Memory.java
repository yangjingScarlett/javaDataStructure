package com.yang.javadatastructure.i_designpattern.c11_facade_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class Memory {

    private int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void load() {
        System.out.println("The memory is loading...");
    }
}
