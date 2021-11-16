package com.company;

public class Main {

    public static void main(String[] args) {
	// test methods(getRadius, getArea) of this instance.
        Circle c1 = new Circle(3,"blue");
        System.out.println("The circle has radius of : " + c1.getRadius() + " and area of " + c1.getArea());
        //test its methods.
        Cylinder c2 = new Cylinder(3,"black",19);
        System.out.println("The Cylinder has radius of :" + c2.getRadius() + " ,height = " + c2.getHeight() + " , area = " + c2.getArea()
                + " and volume = " + c2.getVolume());
    }
}
