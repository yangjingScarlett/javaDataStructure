package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract double cost();
}
