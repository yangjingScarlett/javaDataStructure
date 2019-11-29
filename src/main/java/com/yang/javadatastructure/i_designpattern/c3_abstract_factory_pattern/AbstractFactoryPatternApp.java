package com.yang.javadatastructure.i_designpattern.c3_abstract_factory_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Jing Yang
 * @date: 11/29/2019
 */
public class AbstractFactoryPatternApp {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Choose the name of Bank from where you want to take loan amount: ICBC, HDFC, SBI: ");
        try {
            String bankName;
            bankName = br.readLine();
            System.out.print("\n");
            System.out.print("Choose the type of loan: Home, Business, Education: ");

            String loanName = br.readLine();
            AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
            if (bankFactory == null) {
                System.out.println("Must enter 'Bank' to get the bank.");
                return;
            }
            Bank b = bankFactory.getBank(bankName);

            System.out.print("\n");
            System.out.print("Enter the interest rate for " + b.getBankName() + ": ");

            double rate = Double.parseDouble(br.readLine());
            System.out.print("\n");
            System.out.print("Enter the loan amount you want to take: ");

            double loanAmount = Double.parseDouble(br.readLine());
            System.out.print("\n");
            System.out.print("Enter the number of years to pay your entire loan amount: ");
            int years = Integer.parseInt(br.readLine());

            System.out.print("\n");
            System.out.println("you are taking the loan from " + b.getBankName());

            AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
            if (loanFactory == null) {
                System.out.println("Must enter 'Loan' to get the loan.");
                return;
            }
            Loan l = loanFactory.getLoan(loanName);
            l.setRate(rate);
            l.calculateLoanPayment(loanAmount, years);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
