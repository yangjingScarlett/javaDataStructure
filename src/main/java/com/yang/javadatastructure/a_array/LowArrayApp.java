package com.yang.javadatastructure.a_array;

/*
 * @Author: jing yang 
 * @Date: 2018-08-30 16:18:24 
 */
public class LowArrayApp {

    public static void main(String[] args) {

        LowArray lowArray = new LowArray(100);
        int nElems;
        long searchKey;
        int j;

        // insert item
        lowArray.setElem(0, 77);
        lowArray.setElem(1, 66);
        lowArray.setElem(2, 99);
        lowArray.setElem(3, 11);
        lowArray.setElem(4, 55);
        lowArray.setElem(5, 44);
        lowArray.setElem(6, 33);
        lowArray.setElem(7, 88);
        lowArray.setElem(8, 22);
        lowArray.setElem(9, 30);
        nElems = 10;

        // display items
        for (j = 0; j < nElems; j++) {
            System.out.print(lowArray.getElem(j) + " ");
        }
        System.out.println("");

        // search item
        searchKey = 10;
        for (j = 0; j < nElems; j++) {
            if (lowArray.getElem(j) == searchKey) {
                System.out.print("Find item " + searchKey + " in index [" + j + "]");
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Cannot find item " + searchKey);
        }

        // delete item
        searchKey = 11;
        for (j = 0; j < nElems; j++) {
            if (lowArray.getElem(j) == searchKey) {
                break;
            }
        }
        for (int k = j; k < nElems; k++) {
            lowArray.setElem(k, lowArray.getElem(k + 1));
        }
        nElems--;

        // display item
        for (j = 0; j < nElems; j++) {
            System.out.print(lowArray.getElem(j) + " ");
        }
        System.out.println("");
    }
}