package com.company;

//Create a class called circle. It contains:
public class Circle {

        private double radius = 1.0;
        private String color  = "red";


        public Circle(double radius,String color ){
            this.radius = radius ;
             this.color = "red";

        }

        public double getRadius(){
            return radius;
        }


    public double getArea(){
            return 3.14*radius*radius;
        }



}
