package com.yang.javadatastructure.d_linklist;

/**
 * @author yangjing
 */
public class DoublyLink {

    public long data;
    public DoublyLink next;
    public DoublyLink previous;

    public DoublyLink(long d) {
        this.data = d;
    }

    public void display() {
        System.out.println("{ data:" + data + " }");
    }
}
