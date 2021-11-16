package com.company;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
    return radius;
    }
    public double getArea(){
        double area=3.14*(radius*radius);
        return area;
    }
}
