package com.yang.javadatastructure.d_linklist;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 17:52:35 
 */
public class SortedLinkList {

    private Link first;

    public SortedLinkList() {
        first = null;
    }

    // 有序链表为从大到小排列
    public void insert(int id, double data) {
        Link newLink = new Link(id, data);
        Link previous = null;
        Link current = first;
        while (current != null && id < current.id) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    // 删除链表头的链结点，这里是最大的结点
    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayLinkList() {
        System.out.println("SortedLinkList (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}