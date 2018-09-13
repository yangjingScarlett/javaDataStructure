package com.yang.javadatastructure.a_array;

/*
 * @Author: jing yang 
 * @Date: 2018-08-30 16:44:54 
 */
public class HighArrayApp {

    public static void main(String[] args) {

        HighArray highArray = new HighArray(100);

        highArray.insert(77);
        highArray.insert(10);
        highArray.insert(88);
        highArray.insert(44);
        highArray.insert(55);
        highArray.insert(66);
        highArray.insert(22);
        highArray.insert(33);
        highArray.insert(11);
        highArray.insert(99);

        highArray.display();

        boolean isFind = highArray.find(30);
        if (isFind) {
            System.out.println("Find item");
        } else {
            System.out.println("Cannot find item");
        }

        highArray.delete(22);
        highArray.delete(11);
        highArray.delete(40);

        highArray.display();

        System.out.println("The max value of HighArray is: " + highArray.getMax());
        highArray.deleteMax();
        highArray.display();
    }
}