package com.yang.javadatastructure.i_designpattern.c2_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/25/2019
 */
public class CommercialPlan extends Plan {
    @Override
    void createPlan(int unit) {
        rate = 7.50;
        System.out.println("Commercial Plas: " + rate * unit);
    }
}
