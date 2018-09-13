/*
 * @Author: jing yang 
 * @Date: 2018-08-31 13:29:13 
 */
package com.yang.javadatastructure.a_array;

public class SimpleArrayApp {

    public static void main(String[] args) {
        long[] arr;
        arr = new long[100];
        int nElems = 0;
        int j;
        long searchKey;

        // insert item
        arr[0] = 77;
        arr[1] = 20;
        arr[2] = 99;
        arr[3] = 33;
        arr[4] = 44;
        arr[5] = 66;
        arr[6] = 88;
        arr[7] = 11;
        arr[8] = 22;
        arr[9] = 55;
        nElems = 10;

        // display items
        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        // search item
        searchKey = 22;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                System.out.println("Find item " + searchKey + " index in [" + j + "]");
                break;
            }
        }
        if (j == nElems) {
            System.out.println("Cannot find item " + searchKey);
        }

        // delete item
        searchKey = 66;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        for (int k = j; k < nElems; k++) {
            arr[k] = arr[k + 1];
        }
        nElems--;

        // display items
        for (j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }
}