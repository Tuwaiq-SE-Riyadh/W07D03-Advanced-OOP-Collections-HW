package com.company;

public class circle {
    private double radius = 1.0 ;
    private String color = "red";

    public circle(double radius, String color){
        this.setRadius(radius);
        this.setColor(color);
    }

    public circle() {

    }

    public void setRadius(double radius){this.radius = radius;}
    public  void setColor(String color){this.color = color;}
    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }
}
