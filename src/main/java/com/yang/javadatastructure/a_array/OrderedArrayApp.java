package com.yang.javadatastructure.a_array;

/*
 * @Author: jing yang 
 * @Date: 2018-08-31 15:25:16 
 */
public class OrderedArrayApp {

    public static void main(String[] args) {

        OrderedArray orderedArray = new OrderedArray(50);
        orderedArray.insert(55);
        orderedArray.insert(66);
        orderedArray.insert(77);
        orderedArray.insert(11);
        orderedArray.insert(33);
        orderedArray.insert(22);
        orderedArray.insert(44);
        orderedArray.insert(99);
        orderedArray.insert(100);
        orderedArray.insert(10);

        orderedArray.dispaly();

        int findValue = 40;
        int findIndex = orderedArray.find(findValue);
        if (findIndex >= 0) {
            System.out.println(findValue + " is in arr[" + findIndex + "]");
        } else {
            System.out.println("Cnnot find " + findValue);
        }

        orderedArray.delete(11);
        orderedArray.delete(66);
        orderedArray.delete(101);

        orderedArray.dispaly();

    }
}