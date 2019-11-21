package com.yang.javadatastructure.f_highlevelsort;

/*
 * @Author: jing yang 
 * @Date: 2018-10-22 13:57:54 
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        display(arr);
        sort(arr, 0, arr.length - 1);
        display(arr);
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (r < l) {
            return;
        }
        int partition = partition(arr, l, r);
        quickSort(arr, l, partition - 1);
        quickSort(arr, partition + 1, r);
    }

    private static int partition(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int pivot = arr[low];
        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                swap(left, right, arr);
            }
        }
        swap(left, low, arr);
        return left;
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < 0 || low >= high) {
            return;
        }
        int temp = p(arr, low, high);
        sort(arr, low, temp - 1);
        sort(arr, temp + 1, high);
    }

    // compare p and partition: the range of left and right must contain the pivot index
    // if choose left as pivot, the condition should be arr[left] <= pivot
    // if choose right as pivot, the condition should be arr[right] >= pivot
    private static int p(int[] arr, int low, int high) {
        long pivot = arr[high];
        int left = low;
        int right = high;
        while (left < right) {
            while (left < right && arr[left] < pivot) {
                left++;
            }
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                swap(left, right, arr);
            }
        }
        swap(left, high, arr);
        return left;
    }

    private static void swap(int left, int right, int[] arr) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    private static void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ]");
    }
}
