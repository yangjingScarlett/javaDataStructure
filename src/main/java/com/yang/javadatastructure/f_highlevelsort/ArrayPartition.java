package com.yang.javadatastructure.f_highlevelsort;

/*
 * @Author: jing yang 
 * @Date: 2018-09-05 13:47:02 
 * 
 * 划分算法：选取一个枢纽，从数组两端开始进行，记录左边第一个大于枢纽的值，和右边第一个小于枢纽的值，然后交换它们。
 * 将数组中小于枢纽的元素放在左边，大于枢纽的元素放在右边
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

    public int partition(int start, int end) {
        long pivot = arr[end];
        int left = start;
        int right = end;
        while (left < right) {
            while (left < right && arr[left] < pivot) {
                left++;
            }
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                swap(left, right);
            }
        }
        swap(left, end);
        return left;
    }

    private void swap(int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}