package com.yang.javadatastructure.c_stackqueue;

/**
 * @author: Jing Yang
 * @date: 11/1/2019
 */
public class IntStack {

    private int[] stack;
    private int top;
    private int size;

    public IntStack() {
        this.top = -1;
        this.size = 50;
        this.stack = new int[this.size];
    }

    public IntStack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new int[size];
    }

    public boolean push(int item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        }
        return false;
    }

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        System.out.println("The stack is empty now!");
        return -1;
    }

    public boolean isFull() {
        return top == this.size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            s.append(String.format(" %d", stack[i]));
        }
        return s.toString();
    }

}
