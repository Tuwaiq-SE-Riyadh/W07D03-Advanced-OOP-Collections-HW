package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//Write a Java program to replace the second element of a ArrayList with the specified element
        List<Integer> mylist=new ArrayList<Integer> ();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(5);
        System.out.println( " my list before"+mylist);
        mylist.set(2, 22);
        System.out.println( " my list after replace"+mylist);

        //Create a new priority queue, add some colors (string) and iterate through all elements.

        Queue<String> q1= new LinkedList<String>();
        q1.offer("a");
        q1.offer("c");
        q1.offer("b");
        Iterator<String> iter= q1.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
//        Let the user insert elements into priority queue then check if a specific element is in the list or not.
        Scanner input= new Scanner(System.in);

        PriorityQueue<String> queue= new PriorityQueue<String>();
        System.out.println("enter element is in the list ");
        for (int i = 0; i <5; i++) {
            queue.add(input.nextLine());
        }
        System.out.println(queue);
        System.out.println("check if a specific element is in the list");
        String a=input.nextLine();
        if(queue.contains(a)) {
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
}}
