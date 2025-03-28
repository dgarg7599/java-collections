package com.bridgelabz.listinterface;

import java.util.*;

public class RotateElements {
    // Method to rotate a list left by k positions
    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
        k = k % n; // Handle cases where k > n

        // Create a new list by concatenating two sublists
        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(k, n)); // Add elements from k to end
        rotatedList.addAll(list.subList(0, k)); // Add first k elements to the end

        return rotatedList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();

        List<Integer> rotatedList = rotateList(list, k);

        System.out.println("Rotated List: " + rotatedList);

        sc.close();
    }
}
