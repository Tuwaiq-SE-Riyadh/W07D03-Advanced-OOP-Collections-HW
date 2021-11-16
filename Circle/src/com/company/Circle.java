package com.company;

public class Circle {

    private double radius = 1.0;
    private String color = "red";
    private double area;

    public Circle(double radius, String color, double area) {
        this.radius = radius;
        this.color = color;
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public String toString(){
        return "Radius: "+radius+" Color: "+color+" Area: "+area;
    }
}
