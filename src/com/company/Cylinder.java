package com.company;

public class Cylinder extends circle{


    private  double height =1.0;


    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return (height*getArea());
    }
}
