package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
