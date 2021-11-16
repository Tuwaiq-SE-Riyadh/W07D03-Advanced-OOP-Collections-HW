package Java;

public class Circle {
    private String color="red";
    private double radius=1.0;
    private double area;
    public Circle(String color, double radius, double area){
        this.color=color;
        this.radius=radius;
        this.area=area;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", area=" + area +
                '}';
    }
}
