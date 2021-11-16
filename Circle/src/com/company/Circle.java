package com.company;

public class Circle {
    private double  radius=1.0;
    private String type="red";
    public Circle(double radius,String type){
        this.radius=radius;
        this.type=type;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area=radius*3.14;
        return area;
    }
}
