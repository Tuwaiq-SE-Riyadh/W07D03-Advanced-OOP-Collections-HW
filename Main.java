package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle1 = new Circle(20,"red");
    System.out.println(circle1.getRadius());
    System.out.println(circle1.getArea());

    Cylinder cylinder1=new Cylinder(20.0,"red",30.0);
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder1.getVolume());
    }
}
