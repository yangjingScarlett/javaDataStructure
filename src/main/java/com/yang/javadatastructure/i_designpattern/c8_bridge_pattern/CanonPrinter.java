package com.yang.javadatastructure.i_designpattern.c8_bridge_pattern;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public class CanonPrinter extends Printer {
    public CanonPrinter(Display display) {
        super(display);
    }

    public void multiPrint(int times) {
        System.out.println("----------- Canon printer ----------");
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
