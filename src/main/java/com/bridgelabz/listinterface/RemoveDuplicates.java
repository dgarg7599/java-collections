package com.bridgelabz.listinterface;

import java.util.*;

public class RemoveDuplicates {
    // Method to remove duplicates while preserving order
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : list) {
            if (!uniqueElements.contains(num)) { // Add only if not already in the set
                uniqueElements.add(num);
                uniqueList.add(num);
            }
        }
        return uniqueList;
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

        // Removing duplicates while preserving order
        List<Integer> result = removeDuplicates(list);

        System.out.println("List after removing duplicates: " + result);

        sc.close();
    }
}
