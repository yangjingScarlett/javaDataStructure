package com.yang.javadatastructure.i_designpattern.c14_chain_of_responsibility;

/**
 * @author: Jing Yang
 * @date: 12/27/2019
 */
public class ChainOfResponsibilityApp {

    public static void main(String[] args) {
        Request request = new Request("Alice", 10);
        request.requestLeave();

        Handler mentor = new Mentor("San Zhang");
        Handler manager = new Manager("Si Li");
        Handler ceo = new CEO("Wu Wang");
        // set the chain of responsibility
        mentor.nextHandler = manager;
        manager.nextHandler = ceo;

        boolean result = mentor.process(request);
        System.out.println("Final Result: " + result);

    }
}
