package com.yang.javadatastructure.i_designpattern.c7_adapter_pattern;

/**
 * @author: Jing Yang
 * @date: 12/19/2019
 */
public class IPhoneChargerAdapter implements IPhoneCharger {
    private AndroidCharger androidCharger;

    public IPhoneChargerAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void iphoneAddElectric() {
        androidCharger.androidAddElectric();
    }
}
