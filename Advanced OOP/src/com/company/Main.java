package com.company;

public class Main {

    public static void main(String[] args) {

        circle c = new circle();
        c.setRadius(50);
        System.out.println(c.getArea());

        Cylinder c2 = new Cylinder();
        c2.setHeight(60);
        System.out.println(c2.getVolume()+" "+ c.getArea());

    }
}
