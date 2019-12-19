package com.yang.javadatastructure.i_designpattern.c6_builder_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class Monitor {
    private String company;
    private int size;

    public Monitor(String company, int size) {
        this.company = company;
        this.size = size;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "company: " + company + ", size: " + size;
    }
}
