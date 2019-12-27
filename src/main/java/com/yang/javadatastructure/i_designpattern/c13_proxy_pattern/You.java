package com.yang.javadatastructure.i_designpattern.c13_proxy_pattern;

/**
 * @author: Jing Yang
 * @date: 12/26/2019
 */
public class You implements Buyer {
    private String name;
    private String identifyNumber;
    private double money;

    public You(String name, String identifyNumber) {
        this.name = name;
        this.identifyNumber = identifyNumber;
    }

    public String getName() {
        return name;
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void buy() {
        System.out.println("Provide legal certificate info...");
        System.out.println("Name: " + name + ", Identify Number: " + identifyNumber);
        System.out.println("Pay: " + money);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("End.");
    }
}
