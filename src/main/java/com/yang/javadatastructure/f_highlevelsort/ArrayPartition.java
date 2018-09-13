package com.yang.javadatastructure.f_highlevelsort;

/*
 * @Author: jing yang 
 * @Date: 2018-09-05 13:47:02 
 * 
 * 划分算法：选取一个枢纽，将数组中小于枢纽的元素放在左边，大于枢纽的元素放在右边
 * 它其实时快速排序算法的一部分
 */
public class ArrayPartition {

    private long[] arr;
    private int nElems;

    public ArrayPartition(int maxSize) {
        arr = new long[maxSize];
        nElems = 0;
    }

    public void insert(long insValue) {
        arr[nElems++] = insValue;
    }

    public int size() {
        return nElems;
    }

    public void display() {
        System.out.print("{ ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public int partition(long pivot) {
        int leftIndex = 0;
        int rightIndex = nElems - 1;

        while (true) {
            while (leftIndex < rightIndex && arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (leftIndex < rightIndex && arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex >= rightIndex) {
                break;
            } else {
                long temp = arr[rightIndex];
                arr[rightIndex] = arr[leftIndex];
                arr[leftIndex] = temp;
            }
        }
        return leftIndex;
    }
}