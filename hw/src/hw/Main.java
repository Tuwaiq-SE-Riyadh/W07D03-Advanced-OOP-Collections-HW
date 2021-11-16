package hw;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

// Create a class called circle. It contains:
// Two private instance variables: radius (of type double) and color (of type String), with default value of 1.0
    //and "red", respectively.
//   Two public methods: getRadius() and getArea().
//   Declare an instance of class Circle in the main and test methods(getRadius, getArea) of this instance.

        Circle circle = new Circle();
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

// Create a subclass called Cylinder derived from the superclass Circle. It:
// Inherits the variables and methods from the superclass Circle.
//   One private instance variables: height (of type double) with default value of 1.0 and "red", respectively.
//   Two public methods: getHeight() that return the height and getVolume() that compute the volume (height*area) of cylinder.

// Declare an instance of class Cylinder in the main and test its methods.

        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Height: "+cylinder.getHeight());
        System.out.println("Volume: "+cylinder.getVolume());

//        Write a Java program to replace the second element of a ArrayList with the specified element
        Collection<String> collection = new ArrayList<String>();
        collection.add("Shrooq");
        collection.add("Saleh");
        collection.add("Alamri");
        System.out.println(collection);
        Iterator<String> iterator = collection.iterator();
        iterator.next();
        iterator.next();
        iterator.remove();
        System.out.println(collection);
//        Create a new priority queue, add some colors (string) and iterate through all elements.
        PriorityQueue<String> q = new PriorityQueue<String>();
        q.offer("Red");
        q.offer("Black");
        q.offer("Green");

//        Let the user insert elements into priority queue then check if a specific element is in the list or not.
        Scanner input = new Scanner(System.in);


        int condition = 1;
        while (condition==1){
            System.out.println("Enter Color");
            String str = input.next();
            if (!q.contains(str)){
                System.out.println("color is not in queue");
                q.offer(str);
                System.out.println(q);
            }else {
                System.out.println("Cannot insert color because it is in queue!");
            }
            System.out.println("Enter 1 to restart color or 0 to stop");
            condition = input.nextInt();
        }




    }
}
