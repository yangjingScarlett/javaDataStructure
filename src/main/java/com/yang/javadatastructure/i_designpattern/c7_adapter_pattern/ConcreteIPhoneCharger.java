package com.yang.javadatastructure.i_designpattern.c7_adapter_pattern;

/**
 * @author: Jing Yang
 * @date: 12/19/2019
 */
public class ConcreteIPhoneCharger implements IPhoneCharger {

    @Override
    public void iphoneAddElectric() {
        System.out.println("IPhone is adding electric...");
    }
}
