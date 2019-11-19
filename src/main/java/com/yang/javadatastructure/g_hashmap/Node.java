package com.yang.javadatastructure.g_hashmap;

/**
 * @author: Jing Yang
 * @date: 11/18/2019
 */
public class Node {

    private int id;
    private String key;
    private String value;
    private Node next;

    public Node(int id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{id:" + id + ", key:" + key + ", value:" + value + "}";
    }

    public boolean equals(Node anotherNode) {
        return id == anotherNode.getId() && key.equals(anotherNode.getKey()) && value.equals(anotherNode.getValue());
    }
}