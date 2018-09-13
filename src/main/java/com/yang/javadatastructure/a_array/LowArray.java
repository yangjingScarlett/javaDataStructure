package com.yang.javadatastructure.a_array;

/*
 * @Author: jing yang 
 * @Date: 2018-08-30 16:10:55 
 */

public class LowArray {

    private long[] arr;

    public LowArray(int size) {
        arr = new long[size];
    }

    public long getElem(int index) {
        return arr[index];
    }

    public void setElem(int index, long value) {
        arr[index] = value;
    }
}