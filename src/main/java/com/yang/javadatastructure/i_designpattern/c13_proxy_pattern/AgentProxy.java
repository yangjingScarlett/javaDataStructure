package com.yang.javadatastructure.i_designpattern.c13_proxy_pattern;

/**
 * @author: Jing Yang
 * @date: 12/26/2019
 */
public class AgentProxy implements Buyer {
    private String name;
    private String identifyNumber;
    private double money;
    private Buyer real;

    public AgentProxy(String name, String identifyNumber, double money) {
        this.name = name;
        this.identifyNumber = identifyNumber;
        this.money = money;
    }

    @Override
    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void buy() {
        System.out.println("Agent chats with seller...");
        System.out.println("Agent gets selling info from seller...");
        realize();
        real.buy();
        System.out.println("Agent gives money to seller...");
        System.out.println("Agent gives the deed to you...");
    }

    private synchronized void realize() {
        if (real == null) {
            synchronized (AgentProxy.class) {
                if (real == null) {
                    if (money > 200000) {
                        real = new You(name, identifyNumber);
                        real.setMoney(money);
                    } else {
                        System.out.println("The money is not enough. Please give more money!");
                        money += 200000;
                        realize();
                    }
                }
            }
        }
    }
}
