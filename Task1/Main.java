package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle();
    Cylinder cylinder = new Cylinder();

        System.out.println("Circle getArea ="+circle.getArea());
        System.out.println("Circle getRadius ="+circle.getRadius());

        System.out.println("Cylinder getHeight ="+cylinder.getHeight());
        System.out.println("Cylinder getVolume ="+cylinder.getVolume());
    }
}

class Circle{

    private double radius = 1.0;
    private String color = "red";

    public double getRadius(){

        return this.radius;
    }
    public double getArea(){

        return 3.14 *(getRadius()*getRadius());
    }
}

class Cylinder extends Circle{
    private double height = 1.0;
    private String color = "red";



    public double getHeight(){

        return this.height;
    }
    public double getVolume(){

        return getHeight()*getArea();
    }
}
