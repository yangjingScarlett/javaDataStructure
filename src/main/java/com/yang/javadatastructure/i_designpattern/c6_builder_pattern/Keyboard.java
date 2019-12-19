package com.yang.javadatastructure.i_designpattern.c6_builder_pattern;

/**
 * @author: Jing Yang
 * @date: 12/16/2019
 */
public class Keyboard {

    private String type;
    private String company;
    private double price;

    public Keyboard(String type, String company, double price) {
        this.type = type;
        this.company = company;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "type: " + type + ", price: " + price + ", company: " + company;
    }
}
