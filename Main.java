package com.company;

class circle {

    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

class Cylinder extends circle {

    private double height = 1.0;

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}

public class Main {

    public static void main(String[] args) {
        circle c=new circle();
        System.out.println("Area = "+c.getArea());
        System.out.println("Radius = "+c.getRadius());

        Cylinder cy=new Cylinder();
        System.out.println("Height = "+cy.getHeight());
        System.out.println("Volume = "+cy.getVolume());

    }

}