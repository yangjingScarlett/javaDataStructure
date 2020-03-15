package com.yang.javadatastructure.b_sort;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 11:20:05 
 * 
 * 原理：通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 */
public class ArrayInsert {

    public void sortByInsert(long[] arr) {
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
    }

    // 先找到一个被标记值，默认被标记值的左边序列都是有序的，那么，需要决定的就是被标记值需要被插入的位置
    // 从被标记值的左边第一个元素查起，当他大于被标记值时，则该值向后挪一位为被标记值腾位置，
    // 依次向左查询，直到找到比被标记值小的值，就跳出循环，该位置右边一位就是被标记值需要被插入的位置
    public void sort(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            long temp = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = temp;
        }
    }
}