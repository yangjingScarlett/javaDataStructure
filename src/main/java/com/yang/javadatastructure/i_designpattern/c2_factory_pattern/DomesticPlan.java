package com.yang.javadatastructure.i_designpattern.c2_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/25/2019
 */
public class DomesticPlan extends Plan {

    @Override
    void createPlan(int unit) {
        rate = 3.5;
        System.out.println("Domestic Plan: " + rate * unit);
    }
}
