package com.yang.javadatastructure.b_sort;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 10:37:54 
 * 
 * 原理：每一次从待排序的数据元素中选出最小（或最大）的一个元素，
 * 存放在序列的起始位置，直到全部待排序的数据元素排完
 */
public class ArraySelect {

    public void sortBySelect(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            long temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}