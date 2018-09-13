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
        long[] arr = { 89, 20, 30, 22, 88, 67, 13, 56, 90, 45 };

        ArrayBubble arrayBubble = new ArrayBubble();
        long[] sortedArrFromUp = arrayBubble.sortByBubble(arr);
        display(sortedArrFromUp);

        /*
         * ArraySelect arraySelect = new ArraySelect(); long[] sortedBySelect =
         * arraySelect.sortBySelect(arr); display(sortedBySelect);
         */

        /*
         * ArrayInsert arrayInsert = new ArrayInsert(); long[] sortedByInsert =
         * arrayInsert.sortByInsert(arr); long[] sort = arrayInsert.sortByInsert(arr);
         * display(sortedByInsert); display(sort);
         */
    }  
}