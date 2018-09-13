package com.yang.javadatastructure.c_stackqueue;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 13:46:43 
 */
public class Queue {

    private int maxSize;
    private long[] queArr;
    private int front;
    private int rear;
    private int nElems;

    public Queue(int m) {
        maxSize = m;
        queArr = new long[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    // 在队尾插入
    public void insert(long insValue) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArr[++rear] = insValue;
        nElems++;
    }

    // 在队头删除
    public long remove() {
        long remValue = queArr[front++];
        if (front == maxSize) {
            front = 0;
        }
        nElems--;
        return remValue;
    }

    // 查看队头的值
    public long peekFront() {
        return queArr[front];
    }

    public boolean isEmpty() {
        return nElems == 0;
    }

    public boolean isFull() {
        return nElems == maxSize;
    }

    public int size() {
        return nElems;
    }
}