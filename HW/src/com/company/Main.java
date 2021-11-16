package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Question 1
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());
        // Question 2
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("ArrayList before replace: " +numbers);
        numbers.set(1, 9);
        System.out.println("ArrayList after replace: " +numbers);

        PriorityQueue<String> colors = new PriorityQueue<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        Iterator value = colors.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        System.out.println("enter color");
        String color = scan.next();
            if(colors.contains(color))
                System.out.println("color exist");
            else{
                System.out.println("color added correctly");
                colors.add(color);
                Iterator value2 = colors.iterator();
                while (value2.hasNext()) {
                    System.out.println(value2.next());
                }
            }



    }
}
