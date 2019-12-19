package com.yang.javadatastructure.i_designpattern.c5_prototype_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class Underline implements Prototype {
    private char decoChar;

    public Underline(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        System.out.println(string);
        for (int i = 0; i < length; i++) {
            System.out.print(decoChar);
        }
        System.out.println("");
    }

    @Override
    public Prototype createClone() {
        try {
            return (Underline) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public char getDecoChar() {
        return decoChar;
    }

    public void setDecoChar(char decoChar) {
        this.decoChar = decoChar;
    }
}
