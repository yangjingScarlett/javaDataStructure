package com.yang.javadatastructure.i_designpattern.c3_abstract_factory_pattern;

/**
 * @author: Jing Yang
 * @date: 11/28/2019
 */
public abstract class Loan {
    double rate;

    abstract void setRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
        /**
         * to calculate the monthly loan payment, i.e. EMI
         * rate = annual interest rate / (12 * 100)
         * 1 year  = 12 months
         * n  = number of month
         * so, n = years * 12
         *
         */
        double EMI;
        int n;

        n = years * 12;
        rate = rate / (12 * 100);
        EMI = (rate * Math.pow((1 + rate), n) / (Math.pow(1 + rate, n) - 1)) * loanAmount;
        System.out.println("your monthly EMI is " + EMI + " for the amount " + loanAmount + " you have borrowed");
    }
}
