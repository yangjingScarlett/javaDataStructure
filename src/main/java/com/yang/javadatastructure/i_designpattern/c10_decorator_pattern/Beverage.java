package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public abstract class Beverage {
    protected String desc = "Unknown Beverage";

    public abstract double cost();

    public String getDesc() {
        return desc;
    }
}
