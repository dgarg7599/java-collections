package com.bridgelabz.setinterface;


import java.util.*;


public class SetToASortedList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> list = new LinkedList<>();
        for(int ele: set){
            list.add(ele);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}