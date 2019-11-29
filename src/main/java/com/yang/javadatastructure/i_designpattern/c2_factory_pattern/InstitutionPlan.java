package com.yang.javadatastructure.i_designpattern.c2_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/25/2019
 */
public class InstitutionPlan extends Plan {
    @Override
    void createPlan(int unit) {
        rate = 5.50;
        System.out.println("Institution Plan: " + rate * unit);
    }
}
