package com.yang.javadatastructure.b_sort;

/*
 * @Author: jing yang 
 * @Date: 2018-08-31 17:35:31 
 */
public class SortApp {

    public static void display(long[] arr) {
        System.out.print("数组：[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        long[] arr = new long[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (100f * Math.random());
        }
        display(arr);

        // ArrayBubble arrayBubble = new ArrayBubble();
        // arrayBubble.sortByBubble(arr);
        // display(arr);

        // ArraySelect arraySelect = new ArraySelect();
        // arraySelect.sortBySelect(arr);
        // display(arr);

        ArrayInsert arrayInsert = new ArrayInsert();
        arrayInsert.sort(arr);
        display(arr);
    }
}