package com.yang.javadatastructure.i_designpattern.c3_abstract_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public class BankFactory extends AbstractFactory {
    public Bank getBank(String bankName) {
        if (bankName == null) {
            return null;
        } else if (bankName.equalsIgnoreCase("ICBC")) {
            return new ICBC();
        } else if (bankName.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else if (bankName.equalsIgnoreCase("SBI")) {
            return new SBI();
        } else {
            return null;
        }
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
