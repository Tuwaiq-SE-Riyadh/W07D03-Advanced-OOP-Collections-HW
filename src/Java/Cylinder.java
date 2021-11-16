package Java;
public class Cylinder extends Circle{
    private double height=1.0;

    public Cylinder(String color, double radius, double area ,double height){
        super(color,radius,area);
        this.height=height;

    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return (height*getArea());
    }

    @Override
    public String toString() {
        return super.toString()+"Cylinder{" +
                "height=" + height +
                '}';
    }
}
