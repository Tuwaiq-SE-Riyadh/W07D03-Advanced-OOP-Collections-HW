package HW;

public class Circle
{
    double radius = 1.0;
    String color = "red";

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return ((radius*radius)*3.14159265359);
    }

}
