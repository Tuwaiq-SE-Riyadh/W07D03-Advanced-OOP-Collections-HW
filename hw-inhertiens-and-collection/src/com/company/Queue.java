package com.company;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> queue1=new PriorityQueue<String>();
        Scanner in =new Scanner(System.in);


        queue1.offer("red");
        queue1.offer("green");
        queue1.offer("blue");
        queue1.offer("black");
        Iterator<String> itr = queue1.iterator();
        while (itr.hasNext()){
            System.out.println("enter  color");
            String user = in.next();
            if(queue1.contains(user)) {

                System.out.println("the element is exist");
            }else{
                queue1.offer(user);
            }
            System.out.println(queue1);
        }

    }
}



