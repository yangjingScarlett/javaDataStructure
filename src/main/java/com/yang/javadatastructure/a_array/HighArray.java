package com.yang.javadatastructure.a_array;

/*
 * @Author: jing yang 
 * @Date: 2018-08-30 16:34:28 
 */
public class HighArray {

    private long[] arr;
    private int nElems;

    public HighArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                return true;
            }
        }
        return false;
    }

    public boolean delete(long deleteKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == deleteKey) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        }
        for (int k = j; k < nElems; k++) {
            arr[k] = arr[k + 1];
        }
        nElems--;
        return true;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }

    /* 作业2.1：输出数组中最大数，数组为空返回-1************** */
    public long getMax() {

        if (nElems == 0) {
            return -1;
        }

        long max = arr[0];
        for (int i = 0; i < nElems; i++) {
            long before = arr[i];
            long after = arr[i + 1];
            if (before > after) {
                max = before;
                arr[i] = after;
                arr[i + 1] = before;
            } else {
                max = after;
            }
        }
        return max;
    }

    /* 作业2.2：删除数组中最大数************** */
    public boolean deleteMax() {
        long max = getMax();
        return delete(max);
    }

}