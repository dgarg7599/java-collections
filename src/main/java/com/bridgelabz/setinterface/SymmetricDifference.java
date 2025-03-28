package com.bridgelabz.setinterface;

import java.util.*;

public class SymmetricDifference {
    // Method to compute the symmetric difference of two sets
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);

        result.removeAll(set2); // Remove elements present in Set2
        temp.removeAll(set1);   // Remove elements present in Set1

        result.addAll(temp); // Union of remaining elements
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

        Set<Integer> symmetricDiff = symmetricDifference(set1, set2);


        System.out.println("Symmetric Difference: " + symmetricDiff);

        sc.close();
    }
}

//The symmetric difference of two sets contains elements that are in either set but not in both.
//Symmetric Difference (A △ B) = (Elements in A but not in B) ∪ (Elements in B but not in A).