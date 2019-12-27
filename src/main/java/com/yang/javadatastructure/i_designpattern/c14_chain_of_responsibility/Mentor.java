package com.yang.javadatastructure.i_designpattern.c14_chain_of_responsibility;

/**
 * @author: Jing Yang
 * @date: 12/27/2019
 */
public class Mentor extends Handler {

    public Mentor(String name) {
        super(name);
    }

    @Override
    public boolean process(Request request) {
        boolean result = Math.random() * 10 > 5; // If the random number is greater than 3, means the mentor approve the request.
        String log = String.format("The mentor <%s> deals with the leave request of <%s>, leave days: <%d>, " +
                "result: <%s>.", name, request.getRequestorName(), request.getNumOfDays(), result);
        System.out.println(log);
        if (!result) {
            return false;
        } else if (request.getNumOfDays() <= 3) {
            return true;
        }
        return nextHandler.process(request);
    }
}
