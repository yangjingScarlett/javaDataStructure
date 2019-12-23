package com.yang.javadatastructure.i_designpattern.c8_bridge_pattern;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public class Client {

    public static void main(String[] args) {
        Display stringDisplay = new StringDisplayImpl("Hello, World!");
        Printer printer1 = new Printer(stringDisplay);
        CanonPrinter printer2 = new CanonPrinter(stringDisplay);
        HPPrinter printer3 = new HPPrinter(stringDisplay);

        printer1.display();
        printer2.multiPrint(3);
        printer3.multiPrint(3);
    }
}
