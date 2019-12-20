package com.yang.javadatastructure.i_designpattern.c7_adapter_pattern;

/**
 * @author: Jing Yang
 * @date: 12/19/2019
 */
public class Client {

    public static void main(String[] args) {
        // Now, just have a charger for android phone.
        AndroidCharger androidCharger = new ConcreteAndroidCharger();
        // But my phone is iphone
        IPhone iPhone = new IPhone("iphone 11", 1);

        // I don't have a charger for iphone, but I have a adapter which can turn the android charger to iphone charger.
        IPhoneChargerAdapter adapter = new IPhoneChargerAdapter(androidCharger);
        iPhone.charge(adapter);
    }
}
