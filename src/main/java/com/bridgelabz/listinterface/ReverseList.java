package com.bridgelabz.listinterface;

import java.util.*;

public class ReverseList {

    // Method to reverse an ArrayList
    public static void reverseArrayList(ArrayList<Integer> list) {
        System.out.print("Reversed ArrayList: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }



    // Method to reverse a LinkedList
    public static void reverseLinkedList(LinkedList<Integer> list) {
        System.out.print("Reversed LinkedList: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for ArrayList
        System.out.print("Enter the total number of elements for ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        reverseArrayList(arrayList);

        // Taking input for LinkedList
        System.out.print("Enter the total number of elements for LinkedList: ");
        int m = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            linkedList.add(sc.nextInt());
        }

        reverseLinkedList(linkedList);

    }
}

