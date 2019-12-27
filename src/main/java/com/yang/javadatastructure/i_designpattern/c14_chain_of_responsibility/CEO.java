package com.yang.javadatastructure.i_designpattern.c14_chain_of_responsibility;

/**
 * @author: Jing Yang
 * @date: 12/27/2019
 */
public class CEO extends Handler {

    public CEO(String name) {
        super(name);
    }

    @Override
    public boolean process(Request request) {
        boolean result = Math.random() * 10 > 5;
        String log = String.format("The CEO <%s> deals with the leave request of <%s>, leave days: <%d>, " +
                "result: <%s>.", name, request.getRequestorName(), request.getNumOfDays(), result);
        System.out.println(log);
        return result;
    }
}
