package com.yang.javadatastructure.b_sort;

/*
 * @Author: jing yang 
 * @Date: 2018-08-31 17:23:27 
 * 
 * 原理：从第一个元素开始，每次比较相邻的两个元素，大的放在后面，这样每次比较完整个数组，
 * 数组的最后一位就是最大的。重复这个步骤，除了已经确定的元素。
 */
public class ArrayBubble {

    // 将最大值放到数组后面
    public void sortByBubble(long[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                long before = arr[j - 1];
                long after = arr[j];
                if (before > after) {
                    arr[j - 1] = after;
                    arr[j] = before;
                }
            }
        }
    }
}