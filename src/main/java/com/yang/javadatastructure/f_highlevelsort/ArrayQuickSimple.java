package com.yang.javadatastructure.f_highlevelsort;

/**
 * @author: Jing Yang
 * @date: 7/31/2019
 */
public class ArrayQuickSimple {

    public static void display(long[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                System.out.print(" ");
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public static int partition(int low, int high, long[] arr) {
        long pivot = arr[high];
        int left = low;
        int right = high;
        while (true) {
            while (left < right && arr[left] < pivot) {
                left++;
            }
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                long temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                break;
            }
        }
        long temp = arr[left];
        arr[left] = arr[high];
        arr[high] = temp;
        return left;
    }

    public static void sort(int low, int high, long[] arr) {
        if (low < high) {
            int partition = partition(low, high, arr);
            sort(low, partition - 1, arr);
            sort(partition + 1, high, arr);
        }
    }

    public static void main(String[] args) {
        long[] arr = new long[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random() * 10.0);
        }
        display(arr);
        sort(0, arr.length - 1, arr);
        display(arr);
    }
}
