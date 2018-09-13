package com.yang.javadatastructure.c_stackqueue;

/*
 * @Author: jing yang 
 * @Date: 2018-09-03 13:56:55 
 */
public class QueueApp {

    public static void main(String[] args) {

        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        while (!queue.isEmpty()) {
            long n = queue.remove();
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}