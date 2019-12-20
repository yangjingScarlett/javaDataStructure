package com.yang.javadatastructure.i_designpattern.c7_adapter_pattern;

/**
 * @author: Jing Yang
 * @date: 12/19/2019
 */
public class AndroidPhone {

    private String type;
    private int version;

    public void charge(AndroidCharger androidCharger) {
        androidCharger.androidAddElectric();
    }

    public String getType() {
        return type;
    }

    public int getVersion() {
        return version;
    }
}
