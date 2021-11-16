package hw;

public class Cylinder extends Circle {
    // Inherits the variables and methods from the superclass Circle.
//   One private instance variables: height (of type double) with default value of 1.0 and "red", respectively.
//   Two public methods: getHeight() that return the height and getVolume() that compute the volume (height*area) of cylinder.

// Declare an instance of class Cylinder in the main and test its methods.

    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        //V = π r 2 h
        double volume= 3.14 * getRadius() * 2 *height;
        return volume;
    }
}
