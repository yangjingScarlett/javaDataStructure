package com.yang.javadatastructure.c_stackqueue;

/**
 * @author: Jing Yang
 * @date: 11/6/2019
 */
public class CycleQueue {

    private int[] queue;
    private int size;
    private int total;
    private int front;
    private int rear;

    public CycleQueue(int size) {
        this.size = size;
        this.queue = new int[this.size];
        this.total = 0;
        this.front = -1;
        this.rear = -1;
    }

    public boolean insert(int value) {
        if (isFull()) {
            System.out.println("The queue is full now!");
            return false;
        }

        total++;
        if (rear == size - 1) {
            rear = -1;
        }
        rear++;
        queue[rear] = value;
        return true;
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("The queue is empty now!");
            return -1;
        }
        total--;
        return queue[++front];
    }

    public boolean isFull() {
        return total == size;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        int t = total;
        for (int i = front + 1; t > 0; i++) {
            if (i == size) {
                i = 0;
            }
            str.append(String.format("%d, ", queue[i]));
            t--;
        }
        return str.toString();
    }
}
