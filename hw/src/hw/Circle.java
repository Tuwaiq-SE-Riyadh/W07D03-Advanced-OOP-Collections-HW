package hw;

public class Circle {
    // Create a class called circle. It contains:
// Two private instance variables: radius (of type double) and color (of type String), with default value of 1.0
    //and "red", respectively.
    private double radius;
    private String color;

    public Circle() {
        this.radius =  1.0;
        this.color = "red";
    }
//   Two public methods: getRadius() and getArea().
//   Declare an instance of class Circle in the main and test methods(getRadius, getArea) of this instance.

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = (radius*radius)*3.14;
        return area;
    }
}
