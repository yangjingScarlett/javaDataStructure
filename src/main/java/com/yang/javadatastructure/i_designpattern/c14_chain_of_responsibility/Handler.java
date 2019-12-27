package com.yang.javadatastructure.i_designpattern.c14_chain_of_responsibility;

/**
 * @author: Jing Yang
 * @date: 12/27/2019
 */
public abstract class Handler {
    protected String name;
    protected Handler nextHandler;

    public Handler(String name) {
        this.name = name;
    }

    public abstract boolean process(Request request);
}
