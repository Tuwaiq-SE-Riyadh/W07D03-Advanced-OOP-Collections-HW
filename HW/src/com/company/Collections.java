package com.company;

import java.util.ArrayList;
import java.util.*;

class CollectionHW{
    public static void main(String[] args){
        ArrayList<String> coll = new ArrayList<String>();
        coll.add("Nasser");
        coll.add("Ahmed");
        coll.add("Ali");
        coll.add("Salma");
        Collections.replaceAll(coll, coll.get(1),"Replaced");
        System.out.println(coll);
        System.out.println("---------------------------------------------------------------");

        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.offer("Red");
        queue1.offer("Blue");
        queue1.offer("White");

        while (queue1.size()>0){
            System.out.println(queue1.remove());
        }

        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three Strings to queue: ");
        for (int i = 0; i <3 ; i++) {
            String userInput = input.next();
            queue2.offer(userInput);
        }

        System.out.println("Enter String to check if exist: ");
        String check = input.next();

        while (queue2.size()>0){

            if (queue2.contains(check)){
                System.out.println(check +" in Queue");
                break;
            }

        }
        System.out.println(queue2);
    }
}