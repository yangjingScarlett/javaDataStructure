package com.yang.javadatastructure.i_designpattern.c12_flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Jing Yang
 * @date: 12/25/2019
 */
public class ConcreteCompositeFlyWeight implements FlyWeight {

    private Map<Character, FlyWeight> files = new HashMap<>();

    public void add(char key, FlyWeight flyWeight) {
        files.put(key, flyWeight);
    }

    @Override
    public void operation(String state) {
        FlyWeight flyWeight;
        for (Object o : files.keySet()) {
            flyWeight = files.get(o);
            flyWeight.operation(state);
        }
    }
}
