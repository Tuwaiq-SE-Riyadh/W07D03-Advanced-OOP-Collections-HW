package com.company;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14*Math.pow(this.radius,2);
    }
}
