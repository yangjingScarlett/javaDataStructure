package com.yang.javadatastructure.a_array;

/*
 * @Author: jing yang
 *
 * @Date: 2018-08-31 14:20:29
 */
public class OrderedArray {

    private long[] arr;
    private int nElems;

    public OrderedArray(int maxSize) {
        arr = new long[maxSize];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    // 按照从小到大的顺序插入，构造一个有序数组
    public void insert(long insertValue) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] > insertValue) {
                break;
            }
        }
        for (int k = nElems; k > j; k--) {
            arr[k] = arr[k - 1];
        }
        arr[j] = insertValue;
        nElems = nElems + 1;
    }

    // 用二分法查找数组中是否有某个值，若有返回该值下标，若无返回-1
    public int find(long findValue) {

        int lowerBound = 0;
        int upperBound = nElems - 1;

        while (upperBound >= lowerBound) {
            int curIndex = (lowerBound + upperBound) / 2;
            long curValue = arr[curIndex];
            if (curValue == findValue) {
                return curIndex;
            } else if (curValue > findValue) {
                upperBound = curIndex - 1;
            } else {
                lowerBound = curIndex + 1;
            }
        }

        return -1;
    }

    // 二分法获取给定data的索引，如果没有data，则返回第一个大于data的值的索引
    public int getIndex(int low, int high, int data) {
        if (low <= high) {
            int middle = (low + high) / 2;
            int index = 0;
            if (arr[middle] < data) {
                index = getIndex(middle + 1, high, data);
            } else if (arr[middle] > data) {
                index = getIndex(low, middle - 1, data);
            } else {
                return middle;
            }
            return index;
        } else {
            return low;
        }
    }

    // 删除数组中的某个值
    public boolean delete(long deleteValue) {
        int deleteIndex = find(deleteValue);
        if (deleteIndex >= 0) {
            nElems = nElems - 1;
            for (int i = deleteIndex; i < nElems; i++) {
                arr[i] = arr[i + 1];
            }
            return true;
        } else {
            return false;
        }
    }

    // 展示数组
    public void dispaly() {
        System.out.print("[");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
