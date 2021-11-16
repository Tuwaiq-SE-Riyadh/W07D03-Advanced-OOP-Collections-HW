package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle=new Circle(2,"green");
        System.out.println("The radius of the circle is: "+circle.getRadius());
        System.out.println("The area of the circle is: "+circle.getArea());
        Cylinder cylinder=new Cylinder(2,"red",4.5);
        System.out.println("The height of the cylinder is: "+cylinder.getHeight());
        System.out.println("The volume of the cylinder is: "+cylinder.getVolume());

    }
}
