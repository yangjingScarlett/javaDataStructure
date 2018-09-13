package com.yang.javadatastructure.b_sort;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 11:20:05 
 */
public class ArrayInsert {

    public long[] sortByInsert(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            long temp = arr[i];// 被标记值
            int j;

            // 把被标记的值取出，数组中会空出被标记值的位置
            // 当左边的值大于被标记的值时，左边的值应当往后移一位
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            // 当左边的值小于等于被标记值时，把被标记值插入
            arr[j] = temp;
        }
        return arr;
    }

    public void sort(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            long current = arr[i];
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > current) {
                    arr[j] = arr[j - 1];
                } else {
                    arr[j] = current;
                    break;
                }
            }
        }
    }
}