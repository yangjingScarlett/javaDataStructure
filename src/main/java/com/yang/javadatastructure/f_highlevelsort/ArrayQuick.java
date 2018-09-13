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

    public void display() {
        System.out.print("{ ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public void sortByQuicking() {
        sortByQuick(0, nElems - 1);
    }

    public void sortByQuick(int leftIndex, int rightIndex) {
        int size = rightIndex - leftIndex + 1;
        if (size < 4) {
            manualSort(leftIndex, rightIndex);
        } else {
            long pivot = middleOf3(leftIndex, rightIndex);
            int partition = partition(leftIndex, rightIndex, pivot);
            sortByQuick(leftIndex, partition - 1);
            sortByQuick(partition + 1, rightIndex);
        }

    }

    private int partition(int leftIndex, int rightIndex, long pivot) {
        int left = leftIndex;
        int right = rightIndex - 1;
        while (true) {
            while (arr[++left] < pivot)
                ;

            while (arr[--right] > pivot)
                ;
            if (left >= right) {
                break;
            } else {
                swap(left, right);
            }
        }
        swap(left, rightIndex - 1);
        return left;
    }

    private void manualSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 1) {
            return;
        }
        if (size == 2) {
            if (arr[left] > arr[right]) {
                swap(left, right);
            }
        } else {
            if (arr[left] > arr[right - 1]) {
                swap(left, right - 1);
            }
            if (arr[left] > arr[right]) {
                swap(left, right);
            }
            if (arr[right - 1] > arr[right]) {
                swap(right - 1, right);
            }
        }

    }

    private long middleOf3(int leftIndex, int rightIndex) {
        int middleIndex = (leftIndex + rightIndex) / 2;
        if (arr[leftIndex] > arr[middleIndex]) {
            swap(leftIndex, rightIndex);
        }
        if (arr[leftIndex] > arr[middleIndex]) {
            swap(leftIndex, middleIndex);
        }
        if (arr[middleIndex] > arr[rightIndex]) {
            swap(middleIndex, rightIndex);
        }
        swap(middleIndex, rightIndex - 1);
        return arr[rightIndex - 1];
    }

    private void swap(int swapIndex1, int swapIndex2) {
        long temp = arr[swapIndex1];
        arr[swapIndex1] = arr[swapIndex2];
        arr[swapIndex2] = temp;
    }

}
