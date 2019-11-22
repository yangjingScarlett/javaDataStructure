package com.yang.javadatastructure.i_designpattern.c1_strategy_pattern;

/**
 * @author: Jing Yang
 * @date: 11/22/2019
 */
public class Divide implements Calculation {
    @Override
    public float calculate(float a, float b) {
        if (b == 0) {
            throw new Error("The number that is divided can't be 0.");
        }
        return a / b;
    }
}
