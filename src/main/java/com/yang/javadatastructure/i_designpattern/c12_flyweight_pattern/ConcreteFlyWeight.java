package com.yang.javadatastructure.i_designpattern.c12_flyweight_pattern;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class ConcreteFlyWeight implements FlyWeight {
    private char intrinsicState;

    public ConcreteFlyWeight(char intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
