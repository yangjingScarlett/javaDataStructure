package com.yang.javadatastructure.i_designpattern.c3_abstract_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public class LoanFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    public Loan getLoan(String loanType) {
        if (loanType == null) {
            return null;
        } else if (loanType.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loanType.equalsIgnoreCase("Business")) {
            return new BusinessLoan();
        } else if (loanType.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        } else {
            return null;
        }
    }
}
