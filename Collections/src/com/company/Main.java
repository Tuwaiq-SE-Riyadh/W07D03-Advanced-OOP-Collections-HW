package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(replaceSecondElement(list, 50));
        PriorityQueue<String> colors = new PriorityQueue<String>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Yellow");
        Iterator i = colors.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("enter color");
        String color = input.next();
        if (colors.contains(color))
            System.out.println("color exist");
        else {
            System.out.println("color added correctly");
            colors.add(color);
            Iterator i2 = colors.iterator();
            while (i2.hasNext()) {
                System.out.println(i2.next());
            }
        }
    }

    public static ArrayList<Integer> replaceSecondElement(ArrayList<Integer> list, int element) {
        list.set(1, element);
        return list;
    }
}
