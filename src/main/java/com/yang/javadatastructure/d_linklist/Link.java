package com.yang.javadatastructure.d_linklist;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 16:06:49 
 */
public class Link {

    public int id;
    public double data;
    public Link next;

    public Link(int idParam, double dataParam) {
        id = idParam;
        data = dataParam;
    }

    public void displayLink() {
        System.out.println("{ id:" + id + ", data:" + data + "}");
    }
}