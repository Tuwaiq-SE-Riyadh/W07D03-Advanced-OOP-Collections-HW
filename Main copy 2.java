package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {


        ArrayList<String> li = new ArrayList<String>();
        li.add("work");
        li.add("soft");
        li.add("house");
        li.add("dog");
        li.set(1,"new work");



        Queue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("fast");
        pq.add("good");
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        Scanner s=new Scanner(System.in);
        System.out.println("enter element");
        String va=s.nextLine();
        if (pq.contains(va))
        {
            System.out.println("the elemnt in Queue");
        }else
        {
            System.out.println("the elemnt is not in Queue");
        }
        pq.add(va);
    }

}