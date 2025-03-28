package com.bridgelabz.queueinterface;


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue{
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int top = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int top = q1.poll();
        q2.add(top);

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }


    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
    }
}