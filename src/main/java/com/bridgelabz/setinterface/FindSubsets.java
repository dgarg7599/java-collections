package com.bridgelabz.setinterface;

import java.util.HashSet;

public class FindSubsets {
    public static boolean isSubset(HashSet<Integer> s1, HashSet<Integer> s2){
        for(int i: s1){
            if(!s2.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println(isSubset(set1,set2));

    }
}