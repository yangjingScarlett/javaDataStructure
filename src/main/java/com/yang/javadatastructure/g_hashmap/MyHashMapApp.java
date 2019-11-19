package com.yang.javadatastructure.g_hashmap;

import java.util.HashMap;

/**
 * @author: Jing Yang
 * @date: 10/31/2019
 * <p>
 * MyHashMap has a table like an internal array. It is like a Node<K,V>[], contains int hash, K key, V value, Node<K,V> next.
 * So you can image it as a Linked List
 */
public class MyHashMapApp {

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put("abc", "This is abc");
        hashMap.put("cde", "This is cde");
        hashMap.put("Jane", "This is Jane");
        hashMap.put("bac", "This is bac");
        hashMap.put("cba", "This is cba");
        System.out.println("Size: " + hashMap.size());

        System.out.println("abc: " + hashMap.get("abc"));
        System.out.println("bac: " + hashMap.get("bac"));
        System.out.println("cba: " + hashMap.get("cba"));

        hashMap.remove("abc", "This is abc");
        System.out.println("Size: " + hashMap.size());
    }


}
