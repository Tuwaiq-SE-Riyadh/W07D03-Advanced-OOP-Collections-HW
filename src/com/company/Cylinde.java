package com.company;

public class Cylinde extends circle {
private double height;
    public Cylinde(double radius, String color,double height) {
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return this.getArea() * this.height;

    }
}
