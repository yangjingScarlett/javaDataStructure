package com.yang.javadatastructure.i_designpattern.c12_flyweight_pattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class FlyWeightFactory {

    private Map<Character, FlyWeight> files = new HashMap<>();

    public FlyWeight getFlyWeight(List<Character> compositeState) {
        ConcreteCompositeFlyWeight compositeFlyWeight = new ConcreteCompositeFlyWeight();
        for (char c : compositeState) {
            compositeFlyWeight.add(c, this.getFlyWeight(c));
        }
        return compositeFlyWeight;
    }

    public FlyWeight getFlyWeight(Character state) {
        FlyWeight flyWeight = files.get(state);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight(state);
            files.put(state, flyWeight);
        }
        return flyWeight;
    }
}
