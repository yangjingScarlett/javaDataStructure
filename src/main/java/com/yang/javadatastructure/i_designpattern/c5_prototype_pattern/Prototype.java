package com.yang.javadatastructure.i_designpattern.c5_prototype_pattern;


/**
 * @author: Jing Yang
 * @date: 12/13/2019
 */
public interface Prototype extends Cloneable {

    void use(String string);

    Prototype createClone();
}
