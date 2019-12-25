package com.yang.javadatastructure.i_designpattern.c11_facade_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class HardDrive {

    private int size;

    public HardDrive(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void readData() {
        System.out.println("The hardDrive is reading data...");
    }
}
