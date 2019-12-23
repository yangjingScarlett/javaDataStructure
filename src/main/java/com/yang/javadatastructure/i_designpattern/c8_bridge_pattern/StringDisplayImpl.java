package com.yang.javadatastructure.i_designpattern.c8_bridge_pattern;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public class StringDisplayImpl implements Display {
    private String string;
    private int length;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.length = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
