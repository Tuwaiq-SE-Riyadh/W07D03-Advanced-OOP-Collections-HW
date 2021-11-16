package com.company;

public class Cylinder extends circle{
    private double height = 1.0;

    public Cylinder(double radius, String color){
        super(radius,color);
        this.setHeight(height);
    }

    public Cylinder() {

    }

    public void setHeight(double height){ this.height=height;}
    public double getHeight(){return height;}
    public double getVolume(){return height *(Math.PI* Math.pow(getRadius(),2));}
}
