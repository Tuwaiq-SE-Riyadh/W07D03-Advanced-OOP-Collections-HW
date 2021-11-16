public class Cylinder extends circle {

    private double height;

    public Cylinder(String color, double radius, double area , double height) {
        super(color, radius, area);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return height * getArea();
    }
}
