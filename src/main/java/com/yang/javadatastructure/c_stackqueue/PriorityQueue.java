package com.yang.javadatastructure.c_stackqueue;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 14:33:15 
 */
public class PriorityQueue {

    private int maxSize;
    private long[] arr;
    private int nElems;

    public PriorityQueue(int s) {
        maxSize = s;
        arr = new long[maxSize];
        nElems = 0;
    }

    // 队列从大到小排列
    public void insert(long insValue) {
        if (nElems == 0) {
            arr[nElems++] = insValue;
        } else {
            int i;
            for (i = nElems - 1; i >= 0; i--) {
                if (insValue > arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = insValue;
            nElems++;
        }
    }

    // 移除最小的值
    public long remove() {
        return arr[--nElems];
    }

    public long peek() {
        return arr[nElems - 1];
    }

    public boolean isEmpty() {
        return nElems == 0;
    }

    public boolean isFull() {
        return nElems == maxSize;
    }
}