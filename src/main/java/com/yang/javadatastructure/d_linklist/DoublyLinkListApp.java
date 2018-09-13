package com.yang.javadatastructure.d_linklist;

/**
 * @author yangjing
 */
public class DoublyLinkListApp {

    public static void main(String[] args) {

        DoublyLinkList doublyLinkList = new DoublyLinkList();
        doublyLinkList.insertFirst(33);
        doublyLinkList.insertFirst(44);
        doublyLinkList.insertFirst(10);
        doublyLinkList.insertFirst(21);

        doublyLinkList.insertLast(9);
        doublyLinkList.insertLast(15);
        doublyLinkList.insertLast(28);
        doublyLinkList.insertLast(66);

        doublyLinkList.displayForward();
        doublyLinkList.displayBackward();

        doublyLinkList.deleteFirst();
        doublyLinkList.deleteLast();
        doublyLinkList.deleteKey(21);

        doublyLinkList.displayForward();

        doublyLinkList.insertAfter(15, 77);
        doublyLinkList.insertAfter(0, 31);

        doublyLinkList.displayForward();
    }
}
