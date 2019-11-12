package com.yang.javadatastructure.d_linklist;

/**
 * @author: Jing Yang
 * @date: 11/12/2019
 */
public class DoublyLinkListApp {

    public static void main(String[] args) {
        DoublyLinkList linkList = new DoublyLinkList();
        linkList.insertFirst(100);
        for (int i = 0; i < 10; i++) {
            linkList.insertFirst((int) (Math.random() * 100));
            if (i == 5) {
                linkList.insertFirst(0);
            }
        }
        linkList.displayFromFirst();
        linkList.insertAfter(100, 110);
        linkList.displayFromFirst();

        linkList.deleteFirst();
        linkList.displayFromFirst();

        linkList.deleteLast();
        linkList.displayFromFirst();

        linkList.delete(0);
        linkList.displayFromFirst();

//        DoublyLinkList linkList2 = new DoublyLinkList();
//        for (int i = 0; i < 10; i++) {
//            linkList2.insertLast((int) (Math.random() * 100));
//        }
//        linkList2.displayFromLast();
    }
}
