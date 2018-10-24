package com.yang.javadatastructure.f_highlevelsort;

/*
 * @Author: jing yang
 * 
 * @Date: 2018-09-05 15:43:55
 * 
 * 快速排序：本质上是将数组划分为两个子数组，然后递归调用自身对子数组进行快速排序。
 * 
 * 重点：划分时枢纽的选择，一般用3数据项取中划分法，意思是：取数组第一个元素的值，最后一个元素的值，中间元素的值，用这三个值的中间值作为枢纽。
 * 
 */
public class ArrayQuick {

    private long[] arr;
    private int nElems;

    public ArrayQuick(int maxSize) {
        arr = new long[maxSize];
        nElems = 0;
    }

    public void insert(long insValue) {
        arr[nElems++] = insValue;
    }

    public int getSize() {
        return nElems;
    }

    public void display() {
        System.out.print("{ ");
        for (int i = 0; i < nElems; i++) {
            if (arr[i] < 10) {
                System.out.print(" ");
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public void sortByQuick(int low, int high) {
        int size = high - low + 1;
        if (size > 3) {
            int partition = partition(low, high);
            sortByQuick(low, partition - 1);
            sortByQuick(partition + 1, high);
        } else {
            manualSort(low, high);
        }

    }

    private int partition(int low, int high) {
        int left = low + 1;
        int right = high;
        long pivot = getMiddle(low, high);
        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                swap(left, right);
            }
        }
        swap(left, low + 1);
        return left;
    }

    private long getMiddle(int low, int high) {
        int middle = (low + high) / 2;
        if (arr[low] > arr[middle]) {
            swap(low, middle);
        }
        if (arr[low] > arr[high]) {
            swap(low, high);
        }
        if (arr[middle] > arr[high]) {
            swap(middle, high);
        }
        swap(middle, low + 1);
        return arr[low + 1];
    }

    private void manualSort(int low, int high) {
        int size = high - low + 1;
        if (size == 2) {
            if (arr[low] > arr[high]) {
                swap(low, high);
            }
        } else if (size == 3) {
            int middle = (low + high) / 2;
            if (arr[low] > arr[middle]) {
                swap(low, middle);
            }
            if (arr[low] > arr[high]) {
                swap(low, high);
            }
            if (arr[middle] > arr[high]) {
                swap(middle, high);
            }
        }
    }

    private void swap(int swapIndex1, int swapIndex2) {
        long temp = arr[swapIndex1];
        arr[swapIndex1] = arr[swapIndex2];
        arr[swapIndex2] = temp;
    }

}
