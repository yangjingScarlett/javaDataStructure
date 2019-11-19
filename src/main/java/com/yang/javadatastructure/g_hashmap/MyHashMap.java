package com.yang.javadatastructure.g_hashmap;

import java.nio.charset.StandardCharsets;

/**
 * @author: Jing Yang
 * @date: 11/18/2019
 */
public class MyHashMap {

    private NodeList[] arr = new NodeList[100];
    private int size = 0;

    private int getHashCode(String key) {
        byte[] bytes = key.getBytes(StandardCharsets.US_ASCII);
        int hash = 0;
        for (int i = 0; i < bytes.length; i++) {
            hash = hash + (int) bytes[i];
        }
        return hash;
    }

    public void put(String key, String value) {
        int hash = getHashCode(key);
        Node node = new Node(hash, key, value);

        int index = hash % arr.length;
        if (arr[index] == null) {
            NodeList nodeList = new NodeList(node);
            arr[index] = nodeList;
        } else {
            arr[index].insertNode(node);
        }
        size++;
    }

    public String get(String key) {
        int hash = getHashCode(key);
        int index = hash % arr.length;
        if (arr[index] != null) {
            NodeList nodeList = arr[index];
            Node node = nodeList.getNode(hash, key);
            if (node == null) {
                return null;
            } else {
                return node.getValue();
            }
        } else {
            return null;
        }
    }

    public boolean remove(String key, String value) {
        int hash = getHashCode(key);
        Node node = new Node(hash, key, value);
        int index = hash % arr.length;
        if (arr[index] != null) {
            NodeList nodeList = arr[index];
            node = nodeList.deleteNode(node);
            if (node != null) {
                size--;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
