package com.yang.javadatastructure.i_designpattern.c10_decorator_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class Coco extends Beverage {

    public Coco() {
        this.desc = "Coco";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
