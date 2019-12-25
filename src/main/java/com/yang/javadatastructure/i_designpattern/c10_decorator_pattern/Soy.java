package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + ", Espresso";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
