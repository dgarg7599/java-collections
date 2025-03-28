package com.bridgelabz.setinterface;

import java.util.*;

public class UnionAndIntersection {
    // Method to compute the union of two sets
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // Method to compute the intersection of two sets
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of elements in Set1: ");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements of Set1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }


        System.out.print("Enter the number of elements in Set2: ");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements of Set2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        Set<Integer> unionResult = union(set1, set2);
        Set<Integer> intersectionResult = intersection(set1, set2);


        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);

        sc.close();
    }
}

