package com.bridgelabz.listinterface;

import java.util.*;

public class FindNthElement {
    // Method to find Nth element from the end in LinkedList
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        // Move the first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return "Invalid input: N is larger than the list size";
            }
        }

        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // second now points to the Nth element from the end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        System.out.print("Enter N (Nth element from the end): ");
        int N = sc.nextInt();

        String result = findNthFromEnd(list, N);
        System.out.println("Nth element from the end: " + result);

        sc.close();
    }
}
