package com.yang.javadatastructure.d_linklist;

/**
 * @author: Jing Yang
 * @date: 11/11/2019
 */
public class DoublyLinkList {
    private Link first;
    private Link last;

    public DoublyLinkList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        if (first == null) {
            last = newLink;
        } else {
            newLink.prev = null;
            first.prev = newLink;
            newLink.next = first;
        }
        first = newLink;
    }

    public void insertLast(int data) {
        Link newLink = new Link(data);
        if (last == null) {
            first = newLink;
        } else {
            newLink.prev = last;
            last.next = newLink;

        }
        last = newLink;
    }

    public void insertAfter(int searchData, int insertData) {
        if (first == null) {
            System.out.println("The LinkList is empty.");
        }
        Link newLink = new Link(insertData);
        Link current = first;
        while (current.data != searchData) {
            if (current.next == null) {
                System.out.println("Cannot find given data.");
                return;
            }
            current = current.next;
        }
        newLink.prev = current;
        newLink.next = current.next;
        if (current.next != null) {
            current.next.prev = newLink;
        } else {
            last = newLink;
        }
        current.next = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first == null) {
            return null;
        } else {
            if (first.next != null) {
                first.next.prev = null;
            }
            first = first.next;
            return temp;
        }
    }

    public Link deleteLast() {
        Link temp = last;
        if (last == null) {
            return null;
        } else {
            if (last.prev != null) {
                last.prev.next = null;
            }
            last = last.prev;
            return temp;
        }
    }

    public Link delete(int deleteData) {
        if (first == null) {
            System.out.println("The LinkList is empty.");
            return null;
        }
        Link current = first;
        while (current.data != deleteData) {
            if (current.next == null) {
                System.out.println("Cannot find given data.");
                return null;
            }
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            first = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            last = current.prev;
        }
        return current;
    }


    public void displayFromFirst() {
        System.out.println("----------LinkList(first to last)---------");
        Link current = first;
        while (current != null) {
            System.out.print(String.format("%d, ", current.data));
            current = current.next;
        }
        System.out.println();
        System.out.println("----------LinkList finish---------");
    }

    public void displayFromLast() {
        System.out.println("---------LinkList(last to first)---------");
        Link current = last;
        while (current != null) {
            System.out.print(String.format("%d, ", current.data));
            current = current.prev;
        }
        System.out.println();
        System.out.println("---------LinkList finish---------");
    }


    class Link {
        private int data;
        private Link prev;
        private Link next;

        public Link(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

}
