package com.yang.javadatastructure.i_designpattern.c9_composite_pattern;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public abstract class Component {

    abstract void printList(String prefix);

    abstract Component add(Component component);

    abstract String getName();

    abstract int getSize();

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
