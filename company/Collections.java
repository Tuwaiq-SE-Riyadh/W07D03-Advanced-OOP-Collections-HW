package com.company;



import java.util.*;

public class Collections {


    public static void main(String[] args) {
        //Write a Java program to replace the second element of a ArrayList with the specified element
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("Nouf");
        arraylist.add("Anhar");
        arraylist.add("Razan");
        arraylist.add("Ghadeer");
        System.out.println("ArrayList before replace: " + arraylist);
        arraylist.set(2, "Mansour");
        System.out.println("ArrayList after replace: " + arraylist);

        //Create a new priority queue, add some colors (string) and iterate through all elements.
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.offer("Green");
        queue.offer("Red");
        queue.offer("blue");
        queue.offer("White");
        queue.offer("Gray");
        System.out.println("Elements of the Priority Queue: ");

        Iterator iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        Scanner input=new Scanner(System.in);
        System.out.println("\nplease Insert a given element into a priority queue :");
        String str= input.nextLine();
        System.out.println("The element "+ str +" is available in queue? " + queue.contains(str));


    }}
