package hw;

import java.util.LinkedList;
import java.util.Queue;

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

    }
}
