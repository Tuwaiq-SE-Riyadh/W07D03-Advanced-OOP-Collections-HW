package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "blue", 5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());

        Cylinder cylinder = new Cylinder(5.0, "green", 4, 10);
        System.out.println("Volume: "+cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}

