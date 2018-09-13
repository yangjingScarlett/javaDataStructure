package com.yang.javadatastructure.c_stackqueue;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 14:46:05 
 */
public class PriorityQueueApp {

    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.insert(30);
        priorityQueue.insert(70);
        priorityQueue.insert(40);
        priorityQueue.insert(90);
        priorityQueue.insert(10);

        while (!priorityQueue.isEmpty()) {
            long n = priorityQueue.remove();
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}