package com.company;

public class circle {
    private double radius;
    private String color;

    public circle() {
        this.radius = 1;
        this.color = "red";
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
