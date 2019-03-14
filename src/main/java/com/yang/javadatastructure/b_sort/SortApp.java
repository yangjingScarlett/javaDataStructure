package com.yang.javadatastructure.b_sort;

/*
 * @Author: jing yang 
 * @Date: 2018-08-31 17:35:31 
 */
public class SortApp {

    public static void display(long[] arr) {
        System.out.print("数组：[");
        for (long anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        long[] arr = new long[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (100f * Math.random());
        }

//        ArrayBubble arrayBubble = new ArrayBubble();
//        long[] arrBubble = deepClone(arr);
//        display(arrBubble);
//        arrayBubble.sortByBubble(arrBubble);
//        display(arrBubble);

//        ArraySelect arraySelect = new ArraySelect();
//        long[] arrSelect = deepClone(arr);
//        display(arrSelect);
//        arraySelect.sortBySelect(arrSelect);
//        display(arrSelect);

        ArrayInsert arrayInsert = new ArrayInsert();
        long[] arrInsert = deepClone(arr);
        display(arrInsert);
        arrayInsert.sort(arrInsert);
        display(arrInsert);
    }

    private static long[] deepClone(long[] arr) {
        long[] cloneArr = new long[arr.length];
        System.arraycopy(arr, 0, cloneArr, 0, arr.length);
        return cloneArr;
    }
}