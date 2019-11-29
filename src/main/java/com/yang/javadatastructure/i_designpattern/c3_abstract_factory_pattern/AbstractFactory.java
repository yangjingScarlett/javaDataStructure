package com.yang.javadatastructure.i_designpattern.c3_abstract_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public abstract class AbstractFactory {

    public abstract Bank getBank(String bankName);

    public abstract Loan getLoan(String loanType);
}
