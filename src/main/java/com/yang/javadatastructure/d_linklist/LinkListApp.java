package com.yang.javadatastructure.d_linklist;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 16:18:26 
 */
public class LinkListApp {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(1, 100.00);
        linkList.insertFirst(2, 88.50);
        linkList.insertFirst(3, 93.750);
        linkList.insertFirst(4, 63.50);

        linkList.displayLinkList();

        Link findLink = linkList.findLink(2);
        if (findLink != null) {
            System.out.print("Fink Link:");
            findLink.displayLink();
        } else {
            System.out.println("Cannot find link.");
        }

        Link deleteLink = linkList.deleteLink(4);
        if (deleteLink != null) {
            System.out.print("Delete Link:");
            deleteLink.displayLink();
        } else {
            System.out.println("Cannot find link.");
        }
        linkList.displayLinkList();

        linkList.insertLast(10, 10.00);
        linkList.insertLast(11, 11.00);
        linkList.insertLast(12, 12.00);
        linkList.displayLinkList();
    }
}