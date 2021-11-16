package com.company;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea (){
        return Math.pow(radius, 2) * 3.14;
    }
}
