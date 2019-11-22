package com.yang.javadatastructure.i_designpattern.c1_strategy_pattern;

/**
 * @author: Jing Yang
 * @date: 11/22/2019
 */
public class Examination {
    private String name;
    private Calculation calculation;

    public Examination(String name, Calculation calculation) {
        this.name = name;
        this.calculation = calculation;
    }

    public float exam(float a, float b) {
        return calculation.calculate(a, b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
