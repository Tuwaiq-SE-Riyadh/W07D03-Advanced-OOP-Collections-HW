package com.company;

public class Cylinder extends circle {
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {

    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    public double getHeight() {
        return height;
    }
    public void setHeight( double h) {
        height = h;
    }
}
