package com.yang.javadatastructure.i_designpattern.c7_adapter_pattern;

/**
 * @author: Jing Yang
 * @date: 12/19/2019
 */
public class ConcreteAndroidCharger implements AndroidCharger {
    @Override
    public void androidAddElectric() {
        System.out.println("Android phone is adding electric...");
    }
}
