package com.yang.javadatastructure.d_linklist;

/**
 * @author yangjing
 */
public class DoublyLinkList {

    private DoublyLink first;
    private DoublyLink last;

    public DoublyLinkList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long data) {
        DoublyLink link = new DoublyLink(data);
        if (isEmpty()) {
            last = link;
        } else {
            first.previous = link;
        }
        link.next = first;
        first = link;
    }

    public void insertLast(long data) {
        DoublyLink link = new DoublyLink(data);
        if (last == null) {
            first = link;
        } else {
            last.next = link;
            link.previous = last;
        }
        last = link;
    }

    public boolean insertAfter(long searchCriteria, long insertData) {
        DoublyLink link = new DoublyLink(insertData);
        DoublyLink current = first;
        while (current != null && current.data != searchCriteria) {
            current = current.next;
        }
        if (current == null) {
            return false;
        } else if (current == last) {
            link.next = null;
            last = link;
        } else {
            current.next.previous = link;
            link.next = current.next;
        }
        current.next = link;
        link.previous = current;
        return true;
    }

    public DoublyLink deleteFirst() {
        DoublyLink temp = first;
        if (first.next != null) {
            first.next.previous = null;
        } else {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public DoublyLink deleteLast() {
        DoublyLink temp = last;
        if (last.previous != null) {
            last.previous.next = null;
        } else {
            first = null;
        }
        last = last.previous;
        return temp;
    }

    public DoublyLink deleteKey(long deleteKey) {
        DoublyLink current = first;
        while (current != null && current.data != deleteKey) {
            current = current.next;
        }
        if (current == null) {
            return null;
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = last.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.println("DoublyLinkList (first --> last):");
        DoublyLink current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    public void displayBackward() {
        System.out.println("DoublyLinkList (last --> first):");
        DoublyLink current = last;
        while (current != null) {
            current.display();
            current = current.previous;
        }
    }

}
