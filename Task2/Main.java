package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        System.out.println("Before replace:\n"+arr.toString());
        arr.set(1,"b2");
        System.out.println("After replace:\n"+arr.toString());

        //------------------------------
        Scanner in =new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        q.add("black");
        q.add("red");
        q.add("blue");
        System.out.println("Queue:\n"+q.toString());
        System.out.println("Enter color:");
        String temp = in.next();
        if(q.contains(temp)){
            System.out.println("Item already exists");
        }else {
            System.out.println("Item added");
            q.add(temp);
        }
        System.out.println("Queue:\n"+q.toString());
    }
}
