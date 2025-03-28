package com.bridgelabz.queueinterface;


import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Collections.reverse(queue);
        // not compile because Collections.reverse() does not work on a Queue<Integer>. The Collections.reverse() method is designed for List types
        queue = reverseQueue(queue);
        System.out.println(queue);
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}