package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
