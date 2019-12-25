package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
