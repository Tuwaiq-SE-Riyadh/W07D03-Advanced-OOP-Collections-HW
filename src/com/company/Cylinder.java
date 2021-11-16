package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
        getVolume();
    }
public double getHeight(){
        return height;
}
public double getVolume(){
        double volume=height*this.getArea();
        return volume;
}

}
