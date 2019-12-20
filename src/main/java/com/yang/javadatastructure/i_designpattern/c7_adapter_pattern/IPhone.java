package com.yang.javadatastructure.i_designpattern.c7_adapter_pattern;

/**
 * @author: Jing Yang
 * @date: 12/19/2019
 */
public class IPhone {

    private String type;
    private int version;

    public IPhone(String type, int version) {
        this.type = type;
        this.version = version;
    }

    public void charge(IPhoneCharger iPhoneCharger) {
        iPhoneCharger.iphoneAddElectric();
    }

    public String getType() {
        return type;
    }

    public int getVersion() {
        return version;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
