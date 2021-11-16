package com.company;

public class Main {

    public static void main(String[] args) {
   Circle circle=new Circle(3.1,"red");
        System.out.println("Test for circle class");
        System.out.println("The radios : "+circle.getRadius());
        System.out.println("The area : "+circle.getArea());


        Cylinder cylinder=new Cylinder(3.1,"red");
        System.out.println("Test for cylinder class");
        System.out.println("The height : "+cylinder.getHeight());
        System.out.println("The volume : "+cylinder.getVolume());

    }
}

