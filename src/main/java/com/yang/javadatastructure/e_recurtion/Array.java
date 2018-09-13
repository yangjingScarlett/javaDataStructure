package com.yang.javadatastructure.e_recurtion;

/*
 * @Author: jing yang 
 * @Date: 2018-09-04 18:26:12 
 */
public class Array {

    private long[] arr;
    private int nElems;

    public Array(int maxSize) {
        arr = new long[maxSize];
        nElems = 0;
    }

    public void insert(long insValue) {
        arr[nElems++] = insValue;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void mergeSort() {
        long[] workspace = new long[nElems];
        recMergeSort(workspace, 0, nElems - 1);
    }

    public void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workspace, lowerBound, mid);
            recMergeSort(workspace, mid + 1, upperBound);
            merge(workspace, lowerBound, mid + 1, upperBound);
        }
    }

    public void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound) {
            if (arr[lowPtr] < arr[highPtr]) {
                workspace[j++] = arr[lowPtr++];
            } else {
                workspace[j++] = arr[highPtr++];
            }
        }

        while (lowPtr <= mid) {
            workspace[j++] = arr[lowPtr++];
        }

        while (highPtr <= upperBound) {
            workspace[j++] = arr[highPtr++];
        }

        for (j = 0; j < n; j++) {
            arr[lowerBound + j] = workspace[j];
        }
    }
}