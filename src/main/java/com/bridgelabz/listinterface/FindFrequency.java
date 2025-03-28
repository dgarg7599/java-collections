package com.bridgelabz.listinterface;

import java.util.*;

public class FindFrequency {
    // Method to count frequency of elements in a list
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            // Increment count if the item is already present, otherwise set it to 1
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        // Get frequency map
        Map<String, Integer> frequencyMap = countFrequency(list);

        // Print result
        System.out.println("Frequency of elements: " + frequencyMap);

        sc.close();
    }
}
