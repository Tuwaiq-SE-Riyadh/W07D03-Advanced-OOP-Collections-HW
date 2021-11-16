package com.company;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        // replace the second element of a ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        System.out.println(arr);

        arr.set(1,"One");
        System.out.println(arr);

        //new priority queue, add some colors (string) and iterate through all elements.
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("red");
        pq.add("yellow");
        pq.add("blue");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("");

        //Let the user insert elements into priority queue then check if a specific element is in the list or not.

        Scanner input = new Scanner(System.in);
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        System.out.println("Enter The Elements: ");
        pq1.add(input.nextLine());
        pq1.add(input.nextLine());
        pq1.add(input.nextLine());
        pq1.add(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a value to check if it is exist in Queue or not:");

        if(pq1.contains(input2.nextLine())){
            System.out.println("The element is exist");
        }
        System.out.println(pq1);
    }
}
