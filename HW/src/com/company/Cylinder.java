package com.company;

public class Cylinder extends Circle{

    private double height=1.0;

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return this.height*this.getArea();
    }
}
