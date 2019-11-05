package com.yang.javadatastructure.c_stackqueue;

/**
 * @author: Jing Yang
 * @date: 11/1/2019
 */
public class IntStackApp {

    public static void main(String[] args) {
        IntStack stack = new IntStack();
        int i = 0;
        while (!stack.isFull() && i < 10) {
            stack.push((int) (Math.random() * 100));
            i++;
        }

        System.out.println(String.format("Original stack: %s", stack));

        System.out.print("Pop stack order:");
        while (!stack.isEmpty()) {
            System.out.print(String.format(" %s", stack.pop()));
        }
    }
}
