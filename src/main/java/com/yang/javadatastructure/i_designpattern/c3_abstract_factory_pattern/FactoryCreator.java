package com.yang.javadatastructure.i_designpattern.c3_abstract_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String factoryName) {
        if (factoryName.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (factoryName.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
