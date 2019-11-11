package com.yang.javadatastructure.d_linklist;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 16:09:59 
 */
public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double data) {
        Link newLink = new Link(id, data);
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int id, double data) {
        Link newLink = new Link(id, data);
        if (first == null) {
            first = newLink;
            return;
        }
        Link current = first;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link findLink(int key) {
        Link current = first;
        while (current.id != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link deleteLink(int key) {
        Link current = first;
        Link previous = first;
        while (current.id != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void displayLinkList() {
        System.out.println("LinkList (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}