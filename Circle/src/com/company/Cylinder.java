package com.company;

public class Cylinder extends Circle{

    private double hieght = 1.0;

    public Cylinder(double radius, String color, double area, double hieght){
        super(radius, color, area);
        this.hieght = hieght;
    }

    public double getHieght() {
        return hieght;
    }

    public double getVolume(){
        return (hieght * getArea());
    }

    @Override
    public String toString() {
        return super.toString()+" Cylinder height: "+hieght+" ";
    }
}
