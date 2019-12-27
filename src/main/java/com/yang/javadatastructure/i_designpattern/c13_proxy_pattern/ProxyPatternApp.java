package com.yang.javadatastructure.i_designpattern.c13_proxy_pattern;

/**
 * @author: Jing Yang
 * @date: 12/27/2019
 */
public class ProxyPatternApp {

    public static void main(String[] args) {
        String name = "Alice";
        String identifyNumber = "412722199043789056";
        double money = 100000;
        Buyer agent = new AgentProxy(name, identifyNumber, money);
        agent.buy();
    }
}
