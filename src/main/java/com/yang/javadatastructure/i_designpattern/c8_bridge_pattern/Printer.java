package com.yang.javadatastructure.i_designpattern.c8_bridge_pattern;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public class Printer {
    private Display display;

    public Printer(Display display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}
