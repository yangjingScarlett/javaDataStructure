package com.yang.javadatastructure.i_designpattern.c3_abstract_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/28/2019
 */
public class ICBC implements Bank {

    @Override
    public String getBankName() {
        return "ICBC Bank";
    }
}
