package com.company;

public class circle {
    private double radius= 1.0;
    private String color ="red";

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return ((radius*radius)*3.14);
    }

}
