package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Cylinder cylinderOne = new Cylinder(2.0, "blue",5.0);
        System.out.println("Radius => " + cylinderOne.getRadius());
        System.out.println("Volume   => " + cylinderOne.getVolume());

        // Collections
        System.out.println("\n output Collections \n");

        //ArrayList
        ArrayList<String> name = new ArrayList<String>();
        name.add("Abdullah");
        name.add("AlHussein");

        System.out.println("Original array list: " + name);
        String newName = "Khiled";
        name.set(1,newName);


        System.out.println("Replace second element with 'White'.");
        for(int i=0;i<name.size();i++)
            System.out.println(name.get(i));


        System.out.println();
        //Queue
        Queue<String> color = new LinkedList<>();
        color.add("red");
        color.add("blue");
        color.add("black");
        color.add("white");

        Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //PriorityQueue
        String inputColor;
        int counteney;
        PriorityQueue<String> queueOne = new PriorityQueue<>(Arrays.asList());

        Scanner input = new Scanner(System.in);

        while (true){


            System.out.println("enter color ");
            inputColor = input.next();

            if(queueOne.contains(inputColor)) {
                System.out.println("element exist");
            }
            else {
                queueOne.offer(inputColor);

            }

            System.out.println(" end inter 0 ");
            counteney = input.nextInt();
            if(counteney == 0){
                break;
            }

        }

        System.out.println(queueOne);

    }
}


