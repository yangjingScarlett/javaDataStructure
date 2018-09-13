package com.yang.javadatastructure.b_sort;

/*
 * @Author: jing yang 
 * @Date: 2018-08-31 17:23:27 
 */
public class ArrayBubble {

    // 将最大值放到数组后面
    public long[] sortByBubble(long[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                long before = arr[j];
                long after = arr[j + 1];
                if (before > after) {
                    arr[j] = after;
                    arr[j + 1] = before;
                }
            }
        }
        return arr;
    }
}