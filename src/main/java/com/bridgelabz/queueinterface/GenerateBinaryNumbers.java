package com.bridgelabz.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> queue = new LinkedList<>();

        for(int i=1;i<=n;i++){
            String binaryString = Integer.toBinaryString(i);
            queue.add(binaryString);
        }

        System.out.println(queue);
    }
}