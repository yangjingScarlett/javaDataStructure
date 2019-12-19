package com.yang.javadatastructure.i_designpattern.c5_prototype_pattern;

import java.util.HashMap;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class Manager {

    private HashMap<String, Prototype> map = new HashMap<>();

    public void register(String name, Prototype proto) {
        map.put(name, proto);
    }

    public Prototype create(String protoName) {
        Prototype proto = map.get(protoName);
        return proto.createClone();
    }
}
