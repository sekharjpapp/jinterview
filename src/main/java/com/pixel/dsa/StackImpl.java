package com.pixel.dsa;

public class StackImpl {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize stack
    public StackImpl(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is initially empty
    }

    // Push operation: Adds an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow. Unable to push " + value);
        } else {
            stackArray[++top] = value;  // Increment top and add value
        }
    }

    // Pop operation: Removes and returns the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow.");
            return -1;  // Return -1 if stack is empty
        } else {
            return stackArray[top--];  // Return top element and decrement top
        }
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Size of the stack
    public int size() {
        return top + 1;
    }
    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);  // Create a stack of size 5

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Trying to push an element when the stack is full
        stack.push(60);

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Display current size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
