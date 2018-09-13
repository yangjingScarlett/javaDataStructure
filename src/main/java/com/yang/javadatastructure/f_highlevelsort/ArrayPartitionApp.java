package com.yang.javadatastructure.f_highlevelsort;

/*
 * @Author: jing yang 
 * @Date: 2018-09-05 14:47:17 
 */
public class ArrayPartitionApp {

    public static void main(String[] args) {
        ArrayPartition arrayPartition = new ArrayPartition(50);
        for (int i = 0; i < 14; i++) {
            arrayPartition.insert((long) (Math.random() * 100));
        }
        arrayPartition.display();

        long pivot = 50;
        int index = arrayPartition.partition(pivot);
        System.out.println("The pivot[" + pivot + "] is in index " + index);
        arrayPartition.display();
    }
}