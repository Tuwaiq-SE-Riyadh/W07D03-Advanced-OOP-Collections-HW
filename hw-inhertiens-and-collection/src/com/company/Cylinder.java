package com.company;

public class Cylinder extends Circle {
    private  double  height;
    public Cylinder( double height){
        super( );
        this.height=height;

    }

//    public Cylinder(double height) {
//        this.height=height;
//    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return height*getArea();
    }

}
