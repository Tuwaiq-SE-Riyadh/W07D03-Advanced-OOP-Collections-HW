package com.company;

public class Circle {
       double radius;
        String color;


        public  Circle(){
            this.radius=1.0;
            this.color="red";
        }

        public double getRadius() {
            return radius;
        }
        public double getArea() {
            return radius* radius*3.14;
        }

    }

