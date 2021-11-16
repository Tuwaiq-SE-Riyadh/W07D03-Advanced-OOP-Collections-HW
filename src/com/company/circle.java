package com.company;

public class circle {
    private double radius =1.0;
    private String  color="red";

    public circle(double radius ,String  color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea() {
        double radius = this.radius;
        double area=radius *radius*3.14;
        return area;
    }


}
