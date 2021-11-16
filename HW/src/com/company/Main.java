package com.company;

public class Main {

    public static void main(String[] args) {
        circle test = new circle();
        Cylinder Area = new Cylinder();

        Area.setRadius(2);
        Area.setHeight(3);
        System.out.println("height "+Area.getHeight());
        System.out.println("volume "+Area.getVolume());
    }
}
