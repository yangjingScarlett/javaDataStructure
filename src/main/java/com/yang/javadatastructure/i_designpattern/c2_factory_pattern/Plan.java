package com.yang.javadatastructure.i_designpattern.c2_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/25/2019
 */
public abstract class Plan {
    double rate;

    abstract void createPlan(int unit);
}
