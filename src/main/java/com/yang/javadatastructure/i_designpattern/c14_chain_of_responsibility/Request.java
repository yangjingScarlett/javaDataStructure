package com.yang.javadatastructure.i_designpattern.c14_chain_of_responsibility;

/**
 * @author: Jing Yang
 * @date: 12/27/2019
 */
public class Request {
    private String requestorName;
    private int numOfDays;

    public Request(String requestorName, int numOfDays) {
        this.requestorName = requestorName;
        this.numOfDays = numOfDays;
    }

    public void requestLeave() {
        System.out.println("I'm " + requestorName + ", I need to leave for " + numOfDays + " days.");
    }

    public String getRequestorName() {
        return requestorName;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
}
