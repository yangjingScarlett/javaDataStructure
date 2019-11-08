package com.yang.javadatastructure.c_stackqueue;

/**
 * @author: Jing Yang
 * @date: 11/6/2019
 */
public class CycleQueueApp {

    public static void main(String[] args) {
        CycleQueue queue = new CycleQueue(10);
        while (!queue.isFull()) {
            queue.insert((int) (Math.random() * 100));
        }
        System.out.println(queue);

        queue.delete();
        queue.delete();
        queue.delete();

        queue.insert(100);
        queue.insert(110);
        queue.insert(120);
        queue.insert(130);
        System.out.println(queue);

//        while (!queue.isEmpty()) {
//            System.out.print(String.format("%d, ", queue.delete()));
//        }
    }
}

