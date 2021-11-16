package com.company;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(
                Arrays.asList(1,2,3));

        System.out.println("Before replace second element: "+arrayList);
        arrayList.set(1, 5);
        System.out.println("After replace second element: "+arrayList);

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.offer("Pink");
        queue.offer("Black");
        queue.offer("Blue");
        queue.offer("Orange");

        for(String colors : queue)
            System.out.println(colors);

        Scanner in = new Scanner(System.in);
        PriorityQueue<String> hobbies = new PriorityQueue<String>();
        System.out.println("Enter three of your favorite hobbies: ");
        String hoppy = " ";
        for(int i = 0 ; i < 3 ; i++)
            hobbies.add(in.next());

        System.out.println("Hoppies: "+hobbies);
    }
}
