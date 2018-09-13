package com.yang.javadatastructure.f_highlevelsort;

/**
 * @author yangjing
 * 
 *         希尔排序
 */
public class ArrayShell {

    private long[] arr;
    private int nElems;

    public ArrayShell(int maxSize) {
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
        System.out.println(" }");
    }

    public void sortByShell() {
        for (int gap = nElems / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < nElems; j += gap) {
                    /*
                     * long temp = arr[j]; if (temp < arr[j - gap]) { int k = j - gap; while (k >= 0
                     * && arr[k] > temp) { arr[k + gap] = arr[k]; k -= gap; } arr[k + gap] = temp; }
                     */

                    long current = arr[j];
                    int k;
                    for (k = j; k >= gap; k -= gap) {
                        if (arr[k - gap] > current) {
                            arr[k] = arr[k - gap];
                        } else {
                            break;
                        }
                    }
                    arr[k] = current;
                }
            }
        }
    }
}
