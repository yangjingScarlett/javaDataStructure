package com.yang.javadatastructure.g_hashmap;

/**
 * @author: Jing Yang
 * @date: 11/18/2019
 */
public class NodeList {

    private Node head;

    public NodeList(Node head) {
        this.head = head;
    }

    public void insertNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            node.setNext(head.getNext());
            head.setNext(node);
        }
    }

    public Node deleteNode(Node node) {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node pre = head;
        while (current != null) {
            if (current.equals(node)) {
                if (current == head) {
                    head = head.getNext();
                    return head;
                } else {
                    pre.setNext(current.getNext());
                    return current;
                }
            }
            pre = current;
            current = current.getNext();
        }
        return null;
    }

    public Node getNode(int id, String key) {
        Node current = head;
        while (current != null) {
            if (current.getId() == id && current.getKey().equals(key)) {
                return current;
            } else {
                current = current.getNext();
            }
        }
        return null;
    }

    public int size() {
        int i = 0;
        Node current = head;
        while (current != null) {
            i++;
            current = current.getNext();
        }
        return i;
    }
}
